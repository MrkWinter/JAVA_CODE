package com.mrkwinter03;

import java.util.List;
import java.util.Vector;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Test1 {
    public static void main(String[] args) {
        List list = new Vector();
        list.add(new Book("云边的小卖部", 34, "xu"));
        list.add(new Book("三国演义", 84, "df"));
        list.add(new Book("西游记", 44, "rt"));
        mySort(list);
        System.out.println(list);
    }

    public static void mySort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book temp = (Book) list.get(j);
                Book temp2 = (Book) list.get(j + 1);//向下转型
                if (temp.getPrice() > temp2.getPrice()) {
                    list.set(j, temp2);
                    list.set(j + 1, temp);
                }
            }
        }
    }
}


class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}


