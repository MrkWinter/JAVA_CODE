package com.mrkwinter3;

public class Test2 {
    public static void main(String[] args) {
        Usb[] u1 = new Usb[2];
        u1[0] = new Phone();
        u1[1] = new Camera();
        for (int i = 0; i < u1.length; i++) {
            u1[i].start();//动态绑定对应类型
            if (u1[i] instanceof Phone) {
                ((Phone) u1[0]).call();

            } else if(u1[i] instanceof Camera) {
                ((Camera) u1[i]).takePhoto();
            }
            u1[i].stop();
        }
    }
}

interface Usb {
    void start();

    void stop();
}

class Phone implements Usb {

    @Override
    public void start() {
        System.out.println("Phone开机");
    }

    public void call() {
        System.out.println("滴滴答答打电话");
    }

    @Override
    public void stop() {
        System.out.println("Phone关机");
    }
}

class Camera implements Usb {

    @Override
    public void start() {
        System.out.println("相机开机");
    }

    public void takePhoto() {
        System.out.println("卡嚓卡嚓拍照片");
    }

    @Override
    public void stop() {
        System.out.println("相机关机");
    }
}
