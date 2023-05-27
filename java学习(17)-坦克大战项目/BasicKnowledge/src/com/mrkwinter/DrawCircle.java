package com.mrkwinter;

import javax.swing.*;
import java.awt.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class DrawCircle extends JFrame {
    private MyPanel mp = null;
    public DrawCircle() {
        mp = new MyPanel();
        super.add(mp); //这里是将面板添加到父类JFrame中的框架对象中去
        //设置框架属性
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,300);
    }
    public static void main(String[] args) {
        new DrawCircle();
    }
}
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        //当第一次打开窗口 最大化 最小化 缩放扩大时 会自动调用print函数 保证图像的正确性
        super.paint(g);//调用父类JPanel类中的绘图方法 g相当于一个画笔 super 对g进行初始化

        g.drawOval(10,10,100,100); //用画笔画圆 在JPanel上
    }
}
//总结 ： 先创建一个自定义面板 调用面板中的print方法 对g进行初始化 并且 用g进行在面板上画图
// 有了面板后 就创建一个框架 将面板放到框架中 实现画圆