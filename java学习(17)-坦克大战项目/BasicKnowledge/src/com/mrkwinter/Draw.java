package com.mrkwinter;


import javax.swing.*;
import java.awt.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Draw {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.add(new MyPanel2());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
    }
}
class MyPanel2 extends JPanel {
    @Override
    public void paint(Graphics g) {
        //当第一次打开窗口 最大化 最小化 缩放扩大时 会自动调用print函数 保证图像的正确性
        super.paint(g);//调用父类JPanel类中的绘图方法 g相当于一个画笔 super 对g进行初始化

        g.drawOval(10,10,100,100); //用画笔画圆 在JPanel上
    }
}