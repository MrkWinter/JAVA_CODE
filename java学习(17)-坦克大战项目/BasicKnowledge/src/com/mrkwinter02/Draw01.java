package com.mrkwinter02;

import sun.awt.image.codec.JPEGParam;

import javax.swing.*;
import java.awt.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Draw01 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.add(new MyJPanel());
    }
}
class MyJPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,100,100);//椭圆 圆 x y 一般是左上角
        g.drawLine(0,0,200,200);//直线
        g.drawRect(0,0,100,100);//矩形边框
        g.setColor(Color.ORANGE);//先设置画笔颜色
        g.fillRect(100,100,200,200);//填充矩形
        g.setColor(Color.CYAN);
        g.fillOval(0,200,100,100);//填充圆
        //画图片
        //1. 获取图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.jpg"));
        g.drawImage(image,100,100,164 ,162,this );//x y 左上角
        // 画字符串
        g.setColor(Color.BLACK);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("hi",100,100);//x y 在字体的左下角
    }
}