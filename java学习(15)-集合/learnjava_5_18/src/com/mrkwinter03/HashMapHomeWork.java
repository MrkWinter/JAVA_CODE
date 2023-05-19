package com.mrkwinter03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class HashMapHomeWork {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("123",new Employee("wang",19000,"123"));
        hashMap.put("456",new Employee("xia",9000,"456"));
        hashMap.put("234",new Employee("ming",23000,"234"));
        hashMap.put("678",new Employee("zhang",6000,"678"));
        Set set = hashMap.entrySet();
        for (Object o : set) {
            Map.Entry o1 = (Map.Entry) o;
            if( ((Employee)(o1.getValue())).getSalary()>18000 )
            System.out.println(o1.getKey() + "--" + o1.getValue());
        }

        Set set1 = hashMap.keySet();
        for (Object o : set1) {
            if( ((Employee)(hashMap.get(o))).getSalary()>18000 )
                System.out.println(o + "--" + hashMap.get(o));
        }


    }
}
class Employee {
    private String name;
    private double salary;
    private String id;

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

}