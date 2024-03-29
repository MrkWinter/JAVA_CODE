package com.mrkwinter.mhl.domain;

/**
 * @author MrkWinter
 * @version 1.0
 * #菜谱
 * create table menu (
 * 	id int primary key auto_increment, #自增主键，作为菜谱编号(唯一)
 * 	name varchar(50) not null default '',#菜品名称
 * 	type varchar(50) not null default '', #菜品种类
 * 	price double not null default 0#价格
 * )charset=utf8;
 */
public class Menu {
    private Integer id;
    private String name;
    private String type;
    private double price;

    public Menu() {
    }

    public Menu(Integer id, String name, String type, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
