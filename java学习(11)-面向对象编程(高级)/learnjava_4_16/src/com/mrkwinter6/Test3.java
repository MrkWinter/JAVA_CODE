package com.mrkwinter6;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Car car1 = new Car(49);
        car1.getAir().flow();
        Car car2 = new Car(12);
        car2.getAir().flow();
        Car car3 = new Car(-12);
        car3.getAir().flow();
    }
}

class Car {
    private double temperature;

    public class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷气");
            } else if (temperature < 0) {
                System.out.println("吹暖风");
            } else {
                System.out.println("空调关机");
            }

        }
    }

    ;

    public Air getAir() {
        return new Air();
    } //方法返回成员内部类

    public Car(double temperature) {
        this.temperature = temperature;
    }
}