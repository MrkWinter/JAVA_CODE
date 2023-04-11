package com.mrkwinter.houserent.domain;

//house类表示一个房屋信息
public class House {
    private int id;
    private String name;
    private String phone;
    private String address;
    private int rent;
    private String state;

    public House(String name, String phone, String address, int rent, String state) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //为了方便输出对象信息 实现toString方法
//数据层 存储数据信息 一个对象对应一个信息 对象 与 结构体？？
    @Override
    public String toString() {
        return id +
                "\t " + name +
                "\t" + phone +
                "\t" + address +
                "\t" + rent +
                "\t" + state;
    }
}
