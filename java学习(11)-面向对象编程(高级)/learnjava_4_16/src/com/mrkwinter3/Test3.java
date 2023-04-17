package com.mrkwinter3;

public class Test3 {
    public static void main(String[] args) {
        IA ia = new IA();
        ia.method();
        ia.method2();
        ia.method3();
    }
}

interface IB {
    void cry();
}

class IA {
    public void method() {
        //匿名内部类定义在外部类的方法中
        //编译类型为IB 接口类 运行类型为 底层创建的IA￥类
        IB rabbit = new IB() {
            @Override
            public void cry() {
                System.out.println("呜啊呜啊");
            }
        };//这是一个变量 结束后要加分号
        /**对匿名内部类分析
        new IB() {...}相当于 在底层先创建了一个匿名的类 该类名为 IA￥1 并且实现了IB的接口 即
        class IA$1 implements IB {
            @Override
            public void cry() {
                System.out.println("呜啊呜啊");
            }
        }
         IB rabbit = new IA$1();
         本质上还是在方法内先创建接口类 然后通过创建对象向上转型返回地址
         */
        System.out.println(rabbit.getClass()); //该对象的运行类型 IA$1
        rabbit.cry();
    }


    //基本类的匿名内部类
    //分析
    //1.father 的编译类型是 Father
    //2.father 的运行类型是 IA￥2 该类的第二个匿名内部类
    public void method2() {
        Father father = new Father("ling") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        }; //创建匿名内部类
        /**
         * 解释 (大概)：
         * new Father(ling) {} 的过程  底层是
         * class IA$2 extends Father {
         *     public AI$2(String name) {
         *         super(name);
         *     }
         *    @Override
         *    public void test() {
         *    System.out.println("匿名内部类重写了test方法");
         *  }
         *  Father father = new IA$2(ling)；
         *  本质还是向上转型
         */
        father.test();//动态绑定机制 绑定运行类型 子类IA$2
        System.out.println(father.getClass()); //father对象的运行类型为 IA￥2
    }
    //基于抽象类的匿名内部类
    public void method3() {
        Mother mother = new Mother() {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        /**
         * 解释：
         * 相当于
         * class IA$3 extend Mother {
         *  public void test() {
         *  system.out.println("匿名内部类重写了test方法")
         * }
         * Mother mother = new IA$3();
         */
        mother.test();
        System.out.println(mother.getClass());
    }
}

class Father {
    private  String name;

    public Father(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("ha");
    }
}
abstract class Mother {
    abstract public void test();
}