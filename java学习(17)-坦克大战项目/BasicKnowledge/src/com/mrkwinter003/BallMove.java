package com.mrkwinter003;


import javafx.scene.input.KeyCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class BallMove extends JFrame {
    private MyJPanel mp = null;

    public BallMove() {
        mp = new MyJPanel();
        this.add(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1000, 750);
        this.addKeyListener(mp);//向上转型 JFrame可以监听键盘事件
        //使用监听面板 1. 将面板实现监听器接口 2. 用addKeyListeer方法将面板添加到窗口中
    }

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
}

class MyJPanel extends JPanel implements KeyListener {
    private int x = 100;
    private int y = 100;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        g.setColor(Color.red);
        g.fillOval(x, y, 20, 20);
    }

    //键盘字符监听 字符输入时触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //某个键按下触发
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        //java 中会给每一个键设置一个值
        if (keyCode == KeyEvent.VK_W ||  keyCode == KeyEvent.VK_UP)
            this.y-=4;
        else if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN)
            this.y+=4;
        else if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT)
            this.x-=4;
        else if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT)
            this.x+=4;
        else this.repaint();

    }

    //某个键返回触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}