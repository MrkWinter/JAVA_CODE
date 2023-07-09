package com.mrkwinter.qqclient.view;

import com.mrkwinter.qqclient.service.FileClientServices;
import com.mrkwinter.qqclient.service.MessageClientServices;
import com.mrkwinter.qqclient.service.UserClientService;
import com.mrkwinter.qqclient.utility.Utility;

import java.io.File;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 * 该类完成菜单
 */
public class QQView {

    private UserClientService userClientService = new UserClientService();
    //用于登录服务器/注册用户

    public static void main(String[] args) {
        new QQView().showMenu();
    }

    public void showMenu() {
        boolean loop = true;
        while (loop) {
            System.out.println("--------欢迎登录网络通信系统--------");
            System.out.println("\t\t 1.登录系统");
            System.out.println("\t\t 9.退出系统");
            System.out.println("请输入你的选择：");
            String key1 = Utility.readString(1);
            switch (key1) {
                case "1":
                    System.out.println("请输入账号");
                    String userId = Utility.readString(20);
                    System.out.println("请输入密码");
                    String passWd = Utility.readString(20);
                    //发送到服务器进行验证
                    if (userClientService.checkUser(userId, passWd)) {
                        boolean loop2 = true;
                        while (loop2) {
                            System.out.println("--------欢迎用户" + userId + "--------");
                            System.out.println("--------欢迎进入网络通信系统--------");
                            System.out.println("\t\t 1.显示在线用户列表");
                            System.out.println("\t\t 2.私发消息");
                            System.out.println("\t\t 3.群发消息");
                            System.out.println("\t\t 4.发送文件");
                            System.out.println("\t\t 9.退出系统");
                            System.out.println("请输入你的选择：");
                            String key2 = Utility.readString(1);
                            switch (key2) {
                                case "1":
                                    userClientService.getOnlineList();
                                    System.out.println("\t\t 1.显示在线用户列表");
                                    break;
                                case "2":
                                    System.out.println("请选择在线用户:");
                                    userClientService.getOnlineList();
                                    String getterId = Utility.readString(20);
                                    System.out.println("输入发送消息:");
                                    String prMessage = Utility.readString(1000);
                                    new MessageClientServices().privateSendMessage(userId, getterId, prMessage);
                                    System.out.println("\t\t 2.私发消息");
                                    break;
                                case "3":
                                    System.out.println("输入群发消息:");
                                    String puMessage = Utility.readString(1000);
                                    new MessageClientServices().publicSendMessage(userId, puMessage);
                                    System.out.println("\t\t 3.群发消息");
                                    break;
                                case "4":
                                    System.out.println("请选择在线用户:");
                                    userClientService.getOnlineList();
                                    String getterId2 = Utility.readString(20);
                                    System.out.println("请输入发送文件的路径");
                                    String src = Utility.readString(100);
                                    System.out.println("请输入对方接收文件的路径");
                                    String dest= Utility.readString(100);
                                    new FileClientServices().sendFile(src,dest,userId,getterId2);
                                    System.out.println("\t\t 4.发送文件");
                                    break;
                                case "9":
                                    userClientService.clientExist();
                                    System.out.println("\t\t 9.退出系统");
                                    loop2 = false;
                                    break;
                                default:
                                    break;
                            }
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    } else {
                        System.out.println("账号密码有误或账号已在线");
                    }
                    break;
                case "9":
                    System.out.println("退出系统");
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
