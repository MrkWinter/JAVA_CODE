package com.mrkwinter.tankgame03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
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
    private Vector<Node> positionInformation = null;
    private int enemyTankSize = 3;
    //初始化三张图片
    Image image1 = Toolkit.getDefaultToolkit().getImage("image/bomb_1.gif");
    Image image2 = Toolkit.getDefaultToolkit().getImage("image/bomb_2.gif");
    Image image3 = Toolkit.getDefaultToolkit().getImage("image/bomb_3.gif");

    public MyPanel(boolean choice) throws IOException {

        //恢复初始化
        if (choice) {
            positionInformation = Recorder.getAndRecoveryInformateion();
            if(positionInformation == null)
                choice = false;
            //初始化自己的坦克
            Node myTankNode = positionInformation.get(0);
            myTank = new MyTank(myTankNode.getX(), myTankNode.getY());
            myTank.setDirection(myTankNode.getDirection());
            myTank.setEnemyTanks(enemyTanks);
            myTank.setSpeed(8);
            MyTank.setHealth(Recorder.getMyTankHealth());
            //初始化敌人的坦克
            EnemyTank.setMyTank(myTank);
            EnemyTank.setEnemyTanks(enemyTanks);
            for (int i = 1; i < positionInformation.size(); i++) {
                Node enemyTankNode = positionInformation.get(i);
                EnemyTank enemyTank = new EnemyTank(enemyTankNode.getX(), enemyTankNode.getY());
                enemyTank.setDirection(enemyTankNode.getDirection());
                enemyTanks.add(enemyTank); //初始化坦克后将其添加到Vector集合中去
                new Thread(enemyTank).start(); //包含开火线程
            }
        } if(!choice) {//默认初始化
            //初始化自己的坦克
            myTank = new MyTank(100, 100);
            myTank.setEnemyTanks(enemyTanks);
            myTank.setSpeed(8);
            MyTank.setHealth(999);
            //初始化敌人的坦克
            EnemyTank.setMyTank(myTank);
            EnemyTank.setEnemyTanks(enemyTanks);
            for (int i = 0; i < enemyTankSize; i++) {
                EnemyTank enemyTank = new EnemyTank(i * 100 + 100, 30);
                enemyTank.setDirection(1);
                enemyTanks.add(enemyTank); //初始化坦克后将其添加到Vector集合中去
                new Thread(enemyTank).start(); //包含开火线程
            }
        }
        //记录器初始化
        Recorder.setMyTank(myTank);
        Recorder.setEnemyTanks(enemyTanks);
        new AePlayWave("111.wav").start();
    }

    public void showInfo(Graphics g) {
        //画击毁敌方坦克信息
        g.setColor(Color.BLACK);
        g.setFont(new Font("宋体", Font.BOLD, 25));
        g.drawString("击毁敌方坦克", 1020, 30);
        drawTank(1040, 90, g, 0, 1);
        g.setColor(Color.BLACK);
        g.drawString(Integer.toString(Recorder.getDestroyTankNum()), 1080, 100);
        //画我方坦克生命信息
        g.setFont(new Font("宋体", Font.BOLD, 25));
        g.drawString("我方坦克生命", 1020, 150);
        drawTank(1040, 210, g, 0, 0);
        g.setColor(Color.BLACK);
        g.drawString(Integer.toString(Recorder.getMyTankHealth()), 1080, 220);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画面板
        g.fillRect(0, 0, 1000, 750);
        //画计分面板
        showInfo(g);
        //画我的坦克 调用方法
        if (myTank.isLive())
            drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), 0);
        //画我的坦克的子弹
        for (int i = 0; i < myTank.getMyBullets().size(); i++) {
            MyBullet myBullet = myTank.getMyBullets().get(i);
            if (!myBullet.isLive()) {
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
            myTank.setDirection(0);
            myTank.moveUp();
        }
        if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
            myTank.setDirection(1);
            myTank.moveDown();
        }
        if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
            myTank.setDirection(2);
            myTank.moveLeft();
        }
        if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
            myTank.setDirection(3);
            myTank.moveRight();
        }
        if (keyCode == KeyEvent.VK_J && myTank.isLive()) {
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
