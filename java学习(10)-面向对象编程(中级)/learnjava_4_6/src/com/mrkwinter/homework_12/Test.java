package com.mrkwinter.homework_12;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("wang", 'M', 23, "1121212");
        Teacher t1 = new Teacher("wang", 'M', 23, 12);
        s1.printf_info();
        t1.printf_info();

        //定义多态数组 两个老师两个学生对他们按年龄排序
        Person[] parr = new Person[4];
        parr[0] = new Student("wang", 'M', 23, "23223");
        parr[1] = new Teacher("zhao", 'V', 43, 13);
        parr[2] = new Student("ling", 'M', 13, "23253");
        parr[3] = new Teacher("chin", 'V', 34, 3);


        Test test = new Test();
        test.bobble_sort(parr); //对数组排序
        //现在要打印 但用循环数组接收都是向上转型 只能打印父类信息 想要打印子类信息怎么办？？
        //1判断数组中元素的运行类型 向下转型后打印
        //2在子类中定义toString方法 打印该子类的所有信息 但因为是向上转型
        //想要找到子类的toString方法 可以在父类中定义toString 方法 子类中重写
        //这样可以继承父类的toString方法 直接在子类中打印所有属性 相关知识 java动态绑定机制

        //打印
        for (int i = 0; i < parr.length; i++) {
            System.out.println(parr[i]); //直接调用toString 方法
        }

        //遍历打印调用特有方法
        for (int i = 0; i < parr.length; i++) {
            test.find(parr[i]); //用对象传入 调用find方法  调用特有的方法
        }

        //多态 方法或对象有多种形态 是oop的第三大特征 是建立在封装和继承之上的
        //1方法多态
        //(1)方法的重载 (2)方法的重写
        //2对象多态
        //(1)对象（引用）的运行类型和编译类型可以不一样 编译类型在定义时就确定 不能改变
        //
        Person p1 = new Student("wag", 'm', 23, "2232");
        //p1对象 的编译类型为Person 不能改变
        Student s11 = (Student) p1; //向下转型是重新定义了一个对象(引用)
        //对象的运行类型是可以改变的，通过getClass方法来获取对象运行类型
        Person a1 = new LittleStudent("wag", 'm', 23, "2232");
        System.out.println(a1.getClass());
        //向上转型 父类的引用可以指向子类的对象 向下转型 向上转型对象的引用可以强转为子类对象的引用
        a1 = new Student("wag", 'm', 23, "2232");
        System.out.println(a1.getClass());
        //父类的引用可以来回切换子类 即父类的引用可以来回指向子类
        Student c1 = new LittleStudent("wag", 'm', 23, "2232");
        a1 = c1;
        System.out.println(a1.getClass());
//        (3)编译类型看 = 左边 运行类型看 = 右边

        //编译类型决定了地址访问的空间大小 运行类型决定了加载内存类的起始位置
        //重新定义编译类型就是重新定义
        //编译的内容一定要小于运行内容
        //就是说不能存在编译后找不到运行方式的情况
        //所以不能存在子类的引用 指向父类对象的情况
        //只能存在 父类的引用指向子类的对象的情况
        //对象的本质是地址
        //向下转型的实质是从新开辟了一块对象的引用 定义了其编译类型为子类
        //然后向上转型对象的引用指向的本就是子类的对象的地址 为什么要强转？
        //有关该对象引用的编译类型 可能是告诉编译器 该对象的引用编译类型应改为子类
    }

    //形参为Person 调用study 和 teacher 方法

    public void find(Person p1) { //判断类型向下转型 调用子类方法
        if (p1 instanceof Student) {
            ((Student) p1).study();
        } else if (p1 instanceof Teacher) {
            ((Teacher) p1).teacher();
        } else {
            return;
        }
    }

    //定义冒泡排序
    public void bobble_sort(Person[] parr) {
        Person temp = null;
        for (int i = 0; i < parr.length - 1; i++) {
            for (int j = 0; j < parr.length - i - 1; j++) {
                if (parr[j].getAge() > parr[j + 1].getAge()) {
                    temp = parr[j];
                    parr[j] = parr[j + 1];
                    parr[j + 1] = temp;
                }
            }
        }
    }
}

//继承父类的子类的构造器中必须有super方法调用父类的构造器
//但可以定义构造器中有this方法 调用子类中其他有super定义的构造器
//等于说子类构造器必须有super 可以用this引入super
//读程序时就看构造器第一行 因为this和 super只能在第一行
//第一行的原因？ 执行过super后对父类初始化 this会对父类进行二次初始化

//我是A类
//hh我是B类的有参构造器
//我是C类的有参构造器
//我是C类的无参构造器


