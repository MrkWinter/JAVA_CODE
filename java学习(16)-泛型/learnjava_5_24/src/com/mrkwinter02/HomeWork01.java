package com.mrkwinter02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee<MyDate>("a",2000,new MyDate(2021,3,12)));
        arrayList.add(new Employee<MyDate>("a",4000,new MyDate(2020,5,4)));
        arrayList.add(new Employee<MyDate>("a",6000,new MyDate(2022,8,23)));
        arrayList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName()) != 0? o1.getName().compareTo(o2.getName()):
                        ((MyDate)o1.getBirthday()).compareTo(((MyDate)o2.getBirthday()));
//                if(o1.getName().compareTo(o2.getName()) != 0)
//                return o1.getName().compareTo(o2.getName());
//                else
//                return  ((MyDate)o1.getBirthday()).compareDate(((MyDate)o2.getBirthday()));
            }
        });
        for (Employee o : arrayList) {
            System.out.println(o);
        }

    }
}
class Employee<T> {
    private String name;
    private double sal;
    private T birthday;

    public Employee(String name, double sal, T birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public T getBirthday() {
        return birthday;
    }

    public void setBirthday(T birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int temp;
        if((temp = this.year - o.year) != 0)
            return temp;
        if ((temp = this.month - o.month)!=0)
            return temp;
        if((temp = this.day - o.day) != 0)
            return temp;
        return 0;
    }
}