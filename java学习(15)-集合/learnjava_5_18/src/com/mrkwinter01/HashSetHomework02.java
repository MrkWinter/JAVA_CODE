package com.mrkwinter01;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class HashSetHomework02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee2("wang",23,new Birthday(2020,3,3)));
        hashSet.add(new Employee2("lang",43,new Birthday(2022,6,12)));
        hashSet.add(new Employee2("wang",23,new Birthday(2020,3,3)));
        for (Object o : hashSet) {
            System.out.println(o);
        }

    }
}

class Employee2 {
    private String name;
    private int age;
    private Birthday date;

    public Employee2(String name, int age, Birthday date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Objects.equals(name, employee2.name) && Objects.equals(date, employee2.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date);
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}

class Birthday {
    private int year;
    private int month;
    private int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birthday birthday = (Birthday) o;
        return year == birthday.year && month == birthday.month && day == birthday.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}