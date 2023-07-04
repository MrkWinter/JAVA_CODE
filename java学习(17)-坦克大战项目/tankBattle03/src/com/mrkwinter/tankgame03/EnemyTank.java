package com.mrkwinter.tankgame03;

import java.util.Vector;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class EnemyTank extends Tank implements Runnable {
    private Vector<EnemyBullet> enemyBullets = new Vector<>();//存放子弹
    private static MyTank myTank = null;

    public static void setMyTank(MyTank myTank) {
        EnemyTank.myTank = myTank;
    }

    public Vector<EnemyBullet> getEnemyBullets() {
        return enemyBullets;
    }

    public void setEnemyBullets(Vector<EnemyBullet> enemyBullets) {
        this.enemyBullets = enemyBullets;
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    public void shotBullet() {
        if(enemyBullets.size()<3) {
            EnemyBullet.setMyTank(myTank);
            EnemyBullet enemyBullet = new EnemyBullet(getX(), getY(), getDirection());
            enemyBullets.add(enemyBullet);
            new Thread(enemyBullet).start();
        }
    }

    @Override
    public void run() {
        while (isLive()) {
            int step = 4 + (int) (Math.random() * 16 + 1);
            switch ((int) (Math.random() * 6)) {
                case 0://敌人坦克向上移动
                    for (int i = 0; i < step; i++) {
                        setDirection(0);
                        moveUp();
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1://向下
                    for (int i = 0; i < step; i++) {
                        setDirection(1);
                        moveDown();
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2://向左
                    for (int i = 0; i < step; i++) {
                        setDirection(2);
                        moveLeft();
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3://向右
                    for (int i = 0; i < step; i++) {
                        setDirection(3);
                        moveRight();
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 4:
                case 5:
                    shotBullet();
                    break;
                default:
                    break;
            }
        }
    }
}
