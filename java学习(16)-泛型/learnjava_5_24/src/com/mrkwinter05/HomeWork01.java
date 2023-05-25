package com.mrkwinter05;

import org.junit.Test;

import java.util.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class HomeWork01 {
    @Test
    public static void main(String[] args) {
        Dao<User> userDao = new Dao<>();
        userDao.save("wang", new User(1, 23, "wang"));
        userDao.save("xang", new User(1, 23, "ling"));
        System.out.println(userDao.get("wang"));//1, 23, "wang"
        userDao.update("xang", new User(2, 24, "hong"));
        ArrayList<User> users = new ArrayList<>();
        users.addAll(userDao.list());
        System.out.println(users);//1, 23, "wang"  2,24,"hong"
        userDao.delete("wang");
        System.out.println(userDao.getMap());//2,24,"hong"

    }
}

class Dao<T> {
    private Map<String, T> map = new HashMap<>();

    public Dao() {
    }

    public Dao(HashMap<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity) {
        this.map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        this.map.replace(id, entity);
    }

    public List<T> list() {
        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            list.add(t);
        }
        return list;

    }

    public void delete(String id) {
        map.remove(id);
    }

    public Map<String, T> getMap() {
        return map;
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}