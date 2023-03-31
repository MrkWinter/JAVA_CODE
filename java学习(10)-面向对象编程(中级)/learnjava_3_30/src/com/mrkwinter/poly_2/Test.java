package com.mrkwinter.poly_2;

//多态参数练习 多态参数 就是在方法中把子类作为实参 父类作为形参接收 然后将对象根据向上转型和
//向下转型的机制 进行访问对应父类或子类对象的方法或属性

//练习 定义一个Employee作为父类 属性有姓名和工资  方法有设置属性和访问属性 计算年工资的方法getAnnual
// 定义一个 Worker 作为子类 里面有特有的方法working 工人正在工作
// 定义一个 Manager 作为子类 里面有特有属性bonus 方法manager 经理正在管理
// 在Test 类中定义一个方法 showAllAnnual 显示接收 对象的年工资
//定义一个方法 showWork 显示对象的工作状态
public class Test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 3000);
        Manager mike = new Manager("mike", 6000, 12000);
        Test t1 = new Test();
        t1.showAnnual(tom);
        t1.showAnnual(mike);
        t1.showWork(tom);
        t1.showWork(mike);
    }
    public void showAnnual(Employee e) {
        System.out.println(e.getAnnual());  //向上转型 子类重写父类方法 返回对象的工资
    }
    public void showWork(Employee e) {
        if(e instanceof Worker) {
            System.out.println(((Worker) e).showWork());//展示工人的工作信息
        } else if(e instanceof Manager) {
            System.out.println(((Manager) e).showWork());
        }
    }
}
