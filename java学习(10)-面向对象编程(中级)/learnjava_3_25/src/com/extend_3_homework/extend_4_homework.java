package com.extend_3_homework;

public class extend_4_homework {
    public static void main(String[] args) {
        Pc p1 = new Pc("intel", 521, 16, "IBM");
        p1.showDetail();
        NotePad n1 = new NotePad("radon", 1024, 32, "tianxuan");
        n1.showInfo();
    }
}

class Computer {
    private String cpu;
    private int disk;
    private int memory;

    public Computer(String cpu, int disk, int memory) { //computer 构造器
        this.cpu = cpu;
        this.disk = disk;
        this.memory = memory;
    }

    public String getDetails() {
        return "cpu :" + cpu + " disk :" + disk + " memory :" + memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
class Pc extends Computer { //Pc继承Computer
    String brand;
    public Pc(String cpu, int disk, int memory, String brand) { //若无此构造器则报错
        //computer中无默认构造器 若子类为默认构造器则super使用父类相应的默认的构造器
        super(cpu, disk, memory); //子类构造器中用super指定父类构造器 初始化父类
        this.brand = brand; //父类的构造器完成父类属性的初始化 子类构造器完成子类属性的初始化
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    public void showDetail() {
        System.out.println(getDetails()+" brand :" + brand);
        //调用父类的方法 打印父类和子类的信息
    }
}
class NotePad extends Computer {
    String color = "白色";

    public NotePad(String cpu, int disk, int memory, String color) {
        super(cpu, disk, memory);
        this.color = color;
    }
    public void showInfo() {
        System.out.println(getDetails()+ " color :" + color);
    }
}