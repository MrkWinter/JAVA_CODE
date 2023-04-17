package com.mrkwinter5;

public class Test {
    public static void main(String[] args) {
        CommonEmployee c1 = new CommonEmployee("wang", 12233, 3000);
        Manager m1 = new Manager("ling", 23323, 5000);
        c1.work();
        System.out.println(c1.getMoney());
        m1.work();
        System.out.println(m1.getMoney());
    }
}

final class Rob {

}
//class Cat extends Rob {
//
//}