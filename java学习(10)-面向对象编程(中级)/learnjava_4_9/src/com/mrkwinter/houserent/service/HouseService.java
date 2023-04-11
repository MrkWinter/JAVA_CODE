package com.mrkwinter.houserent.service;

import com.mrkwinter.houserent.domain.House;

public class HouseService {

    private House[] houses;//保存数据
    private int count = 0;//当前容量
    private int size; //表示最大容量
    public HouseService(int size) {
        //这里用方法初始化三个对象
        houses = new House[size];//根据指定创建数组大小
        this.size = size;
    }
    public House[] retHouse() {
        return houses; //返回数组
    }

    public void AddHouse(House newHouse) {
        if(count == size) {
            //数据满动态增加数组
            House[] newHouses = new House[size+5];
            this.size = size + 5;
            for (int i = 0; i < houses.length; i++) {
                newHouses[i] = houses[i];//将旧数组拷贝给扩容过的新数组
            }
            houses = newHouses;//将新数组的地址反给原数组的引用 原数组内存被回收
            System.out.println("扩容成功，现阶段信息最大容量为" + size);
        }
        newHouse.setId(count+1);
        houses[count++] = newHouse;
        System.out.println("-------添加成功------");
    }
//!!!!!!!!!!!!!
    public void delHouse(int id) {
        if(!(id>=0&&id<=count)) {
            System.out.println("找不到对应编号");
            return;
        }
        for (int i = id-1; i <count; i++) {
            houses[i] = houses[i + 1];
        }
            houses[count--] = null;
        System.out.println("-----删除成功-----");
    }
    //!!!!!!!!!!!!!!
}
