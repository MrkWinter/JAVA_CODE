package com.mrkwinter.tankgame03;

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
@SuppressWarnings("all")
public class MyPanel extends JPanel implements KeyListener, Runnable {
    public static Vector<Bomb> bombs = new Vector<>();
    private MyTank myTank = null;
    private Vector<EnemyTank> enemyTanks = new Vector();//用Vector集合存放敌人坦克元素 可以实现多线程
    private int enemyTankSize = 2;
    //初始化三张图片
    Image image1 = Toolkit.getDefaultToolkit().getImage("image/bomb_1.gif");
    Image image2 = Toolkit.getDefaultToolkit().getImage("image/bomb_2.gif");
    Image image3 = Toolkit.getDefaultToolkit().getImage("image/bomb_3.gif");

    public MyPanel() {

        //初始化自己的坦克
        myTank = new MyTank(100, 100);
        myTank.setEnemyTanks(enemyTanks);
        myTank.setSpeed(8);
        //初始化敌人的坦克
        EnemyTank.setMyTank(myTank);
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(i * 100 + 100, 30);
            enemyTank.setDirection(1);
            enemyTanks.add(enemyTank); //初始化坦克后将其添加到Vector集合中去
            new Thread(enemyTank).start(); //包含开火线程
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画面板
        g.fillRect(0, 0, 1000, 750);
        //画我的坦克 调用方法
        if (myTank.isLive())
            drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), 0);
        //画我的坦克的子弹
        for (int i = 0; i < myTank.getMyBullets().size(); i++) {
            MyBullet myBullet = myTank.getMyBullets().get(i);
            if(!myBullet.isLive()) {
                myTank.getMyBullets().remove(i);
            } else {
                g.setColor(Color.CYAN);
                g.fillOval(myTank.getMyBullets().get(i).getX() - 2,
                        myTank.getMyBullets().get(i).getY() - 2, 4, 4);
            }
        }
        //画敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirection(), 1);
        }
        //画敌人坦克的子弹
        for (EnemyTank enemyTank : enemyTanks) {
            for (int i = 0; i < enemyTank.getEnemyBullets().size(); i++) {
                EnemyBullet enemyBullet = enemyTank.getEnemyBullets().get(i);
                if (!enemyBullet.isLive()) {
                    enemyTank.getEnemyBullets().remove(i);
                } else {
                    g.setColor(Color.ORANGE);
                    g.fillOval(enemyBullet.getX(), enemyBullet.getY(), 4, 4);
                }
            }
        }
        //画爆炸后的坦克
            for (int i = 0; i < bombs.size(); i++) {
                Bomb bomb = bombs.get(i);
                if (!bomb.isLive())
                    bombs.remove(i);
                if (bomb.getLifeTime() > 6)
                    g.drawImage(image1, bomb.getX() - 30, bomb.getY() - 30, 60, 60, this);
                else if (bomb.getLifeTime() > 3)
                    g.drawImage(image2, bomb.getX() - 30, bomb.getY() - 30, 60, 60, this);
                else if (bomb.getLifeTime() > 0)
                    g.drawImage(image3, bomb.getX() - 30, bomb.getY() - 30, 60, 60, this);
                bomb.lifeDown();
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
        } if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
            myTank.moveDown();
            myTank.setDirection(1);
        } if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
            myTank.moveLeft();
            myTank.setDirection(2);
        } if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
            myTank.moveRight();
            myTank.setDirection(3);
        } if (keyCode == KeyEvent.VK_J && myTank.isLive()) {
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
