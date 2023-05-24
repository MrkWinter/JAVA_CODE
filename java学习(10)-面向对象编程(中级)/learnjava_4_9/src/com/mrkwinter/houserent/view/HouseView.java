package com.mrkwinter.houserent.view;

import com.mrkwinter.houserent.domain.House;
import com.mrkwinter.houserent.service.HouseService;
import com.mrkwinter.houserent.utils.Utility;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class HouseView {
    private boolean loop = true;
    private char key = '1';
    private HouseService houseService = new HouseService(5);//创建一个数组

    public void mian_Menu() {
        do {
            System.out.println("--------房屋出租系统-------");
            System.out.println("\t\t1 新 增 房 屋 信 息");
            System.out.println("\t\t2 查 找 房 屋 信 息");
            System.out.println("\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退 出");
            System.out.println("输入你的选择:");
            key = Utility.readChar();//调用工具包中的方法 返回一个字符 赋值给 key
            switch (key) {
                case '1':
                    addHouseView();
                    break;
                case '2':
                    selHouseView();
                    break;
                case '3':
                    delHouseView();
                    break;
                case '4':
                    modHouseView();
                    break;
                case '5':
                    listHouseView();
                    break;
                case '6':
                    exitView();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        } while (loop);

    }

    //显示房屋列表的方法
    public void listHouseView() {
        System.out.println("----------房屋列表---------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态(出租/未出租)");
//        //调用HouseService中的方法 得到初始化数组打印他们 !!
//        HouseService h = new HouseService(3);//直接初始化房屋数据 这里当成属性比较好？
//        for (int i = 0; i < h.retHouse().length; i++) {
//            System.out.println(h.retHouse()[i].toString());//打印房屋信息
//        } //!!
        House[] houses = houseService.retHouse(); //将HouseService对象中的数组返回的地址给houses
        //数组中的内容是对象 为数据层的对象定义的House类
        //目前情况 数据层定义基本数据 如要存放的对象(单个)
        //服务层实现数据的集合定义 即储存(初始化) 得到数据集合返回界面层
        //界面层接收服务层处理后的数据 显示给用户 目前显示的有主菜单 以及 房屋列表

        //这里的实现方式 数组的大小不可变 我感觉应在Service中定义一个方法 调用该方法
        //可以实现数组大小的重新定义 然后将旧数组拷贝进去 有利于增删查改
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null)
                break;
            System.out.println(houses[i].toString());//对象定义了打印实现的方法
        }
    }


    public void addHouseView() {
        System.out.println("----新增房屋信息----");
        System.out.println("姓名：");
        String name = Utility.readString(5);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(10);
        System.out.println("租金：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        House newhouse = new House(name, phone, address, rent, state);
        houseService.AddHouse(newhouse);
    }

    public void delHouseView() {
        System.out.println("----删除房屋信息----");
        System.out.println("请输入删除房屋对应的编号");
        int input = Utility.readInt();
        System.out.println("确认要删除吗(无法恢复)y/n");
        char isSure = Utility.readConfirmSelection();
        if (isSure == 'Y')
            houseService.delHouse(input);
    }

    public void exitView() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y')
            loop = false;
        System.out.println("退出成功");
    }

    //根据id查找
    public void selHouseView() {
        System.out.println("请输入需要查询的信息id：");
        int id = Utility.readInt();
        House objHouse = houseService.selHouse(id);
        if (objHouse == null) {
            System.out.println("根据id未查询到该信息");
            return;
        }
        System.out.println("该房屋信息为：" + objHouse.toString());
    }

    //改
    public void modHouseView() {
        System.out.println("请输入需要修改的信息id：");
        int id = Utility.readInt();
        if (houseService.modHouse(id)) {
            System.out.println("修改成功");
            return;
        }
        System.out.println("修改失败");
    }
}
