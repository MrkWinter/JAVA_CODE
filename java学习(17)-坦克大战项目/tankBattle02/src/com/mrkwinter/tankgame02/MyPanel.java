package com.mrkwinter.tankgame02;

import javafx.scene.input.KeyCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author MrkWinter
 * @version 1.0
 * 游戏的绘图区域
 */
public class MyPanel extends JPanel implements KeyListener, Runnable {
    private MyTank myTank = null;
    private Vector<EnemyTank> enemyTanks = new Vector();//用Vector集合存放敌人坦克元素 可以实现多线程
    private int enemyTankSize = 3;

    public MyPanel() {
        //初始化自己的坦克
        myTank = new MyTank(100, 100);
        myTank.setEnemyTanks(enemyTanks);
        myTank.setSpeed(8);
        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(i * 100 + 100, 30);
            enemyTank.setDirection(1);
            enemyTanks.add(enemyTank); //初始化坦克后将其添加到Vector集合中去
            new Thread(enemyTank).start();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画面板
        g.fillRect(0, 0, 1000, 750);
        //画坦克 调用方法
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), 0);
        //画敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
        }
        //画我的坦克的子弹
        if (myTank.getMyBullet() != null) {
            g.setColor(Color.CYAN);
            g.fillOval(myTank.getMyBullet().getX() - 2, myTank.getMyBullet().getY() - 2, 4, 4);
        }
    }

    public void drawTank(int x, int y, Graphics g, int direction, int color) {
        switch (color) { //设置坦克颜色
            case 0:
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.ORANGE);
                break;
            case 2:
                g.setColor(Color.BLUE);
                break;
            case 3:
                g.setColor(Color.RED);
            default:
                break;
        }
        switch (direction) {
            case 0: //上
                g.fill3DRect(x - 20, y - 30, 10, 60, false);
                g.fill3DRect(x - 10, y - 20, 20, 40, false);
                g.fill3DRect(x + 10, y - 30, 10, 60, false);
                g.fill3DRect(x - 2, y - 30, 4, 30, true);
                g.fillOval(x - 10, y - 10, 20, 20);
                break;
            case 1: //下
                g.fill3DRect(x - 20, y - 30, 10, 60, false);
                g.fill3DRect(x - 10, y - 20, 20, 40, false);
                g.fill3DRect(x + 10, y - 30, 10, 60, false);
                g.fill3DRect(x - 2, y, 4, 30, true);
                g.fillOval(x - 10, y - 10, 20, 20);
                break;
            case 2: //左
                g.fill3DRect(x - 30, y - 20, 60, 10, false);
                g.fill3DRect(x - 20, y - 10, 40, 20, false);
                g.fill3DRect(x - 30, y + 10, 60, 10, false);
                g.fill3DRect(x - 30, y - 2, 30, 4, false);
                g.fillOval(x - 10, y - 10, 20, 20);
                break;
            case 3: //右
                g.fill3DRect(x - 30, y - 20, 60, 10, false);
                g.fill3DRect(x - 20, y - 10, 40, 20, false);
                g.fill3DRect(x - 30, y + 10, 60, 10, false);
                g.fill3DRect(x, y - 2, 30, 4, false);
                g.fillOval(x - 10, y - 10, 20, 20);
                break;


        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        //java 中会给每一个键设置一个值
        if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
            myTank.moveUp();
            myTank.setDirection(0);
        } else if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
            myTank.moveDown();
            myTank.setDirection(1);
        } else if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
            myTank.moveLeft();
            myTank.setDirection(2);
        } else if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
            myTank.moveRight();
            myTank.setDirection(3);
        } else if (keyCode == KeyEvent.VK_J) {
            myTank.shotBullet();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            this.repaint();
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
