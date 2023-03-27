package com.extend_2;

public class Test {
    public static void main(String[] args) {
        Pupil p1 = new Pupil();
        p1.age = 12;
        p1.name = "xiaohong";
        p1.setScore(89.0);
        p1.showInfo();
        p1.testing();
        Graduate g1 = new Graduate();
        g1.age = 23;
        g1.name = "xiaoming";
        g1.showInfo();
        g1.testing();
    }
}
