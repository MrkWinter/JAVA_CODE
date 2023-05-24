package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Week[] v1 = Week.values();
        for (Week v :
                v1) {
            System.out.println(v);
        }
    }
}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + "\t";
    }
}
