package com.mrkwinter6;

import com.mrkwinter2.B;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {

        Person wang = new Person("wang", new Boat());
        wang.passRiver();
        wang.passRoad();
    }
}

interface Vehicles {
    void work();
}

class House implements Vehicles {
    @Override
    public void work() {
        System.out.println("马跑路");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("船划水");
    }
}

class VehiclesDevelop {
    private static House house = new House();

    private VehiclesDevelop() {
    }

    public static House getHouse() {
        return house;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles vehicles = VehiclesDevelop.getHouse();

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesDevelop.getBoat();
        }
        vehicles.work();
    }

    public void passRoad() {
        if (!(vehicles instanceof House)) {
            vehicles = VehiclesDevelop.getHouse();
        }
        vehicles.work();
    }
}