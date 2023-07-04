package com.mrkwinter.tankgame03;

import java.util.Vector;

/**
 * @author MrkWinter
 * @version 1.0
 * 我的坦克
 */
@SuppressWarnings("all")
public class MyTank extends Tank {
    private static int health;
    private Vector<MyBullet> myBullets = new Vector<>();
    private Vector<EnemyTank> enemyTanks = null;

    public MyTank(int x, int y) {
        super(x, y);
    }

    public void shotBullet() {
        if (myBullets.size() < 3) {
            MyBullet myBullet = new MyBullet(getX(), getY(), getDirection(), enemyTanks);
            myBullets.add(myBullet);
            new Thread(myBullet).start(); //启动子弹线程
        }
    }


    @Override
    public boolean checkMove() {
        switch (this.getDirection()) {
            case 0: //我的坦克向上
                //遍历敌人坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    if (enemyTanks.get(i).getDirection() <= 1) {//敌人坦克向上向下情况
                        if (Math.abs(this.getX() - enemyTanks.get(i).getX()) <= 40
                                && this.getY() - enemyTanks.get(i).getY() <= 60
                                && this.getY() - enemyTanks.get(i).getY() > 0) { //敌人坦克在上面
                            return false;
                        }
                    } else { //敌人坦克向左向右情况
                        if (Math.abs(this.getX() - enemyTanks.get(i).getX()) <= 50
                                && this.getY() - enemyTanks.get(i).getY() <= 50
                                && this.getY() - enemyTanks.get(i).getY() > 0) { //敌人坦克在上面
                            return false;
                        }
                    }
                }
                return true;
            case 1: //向下
                for (int i = 0; i < enemyTanks.size(); i++) {
                    if (enemyTanks.get(i).getDirection() <= 1) {//敌人坦克向上向下情况
                        if (Math.abs(this.getX() - enemyTanks.get(i).getX()) <= 40
                                && enemyTanks.get(i).getY() - this.getY() <= 60
                                && enemyTanks.get(i).getY() - this.getY() > 0) { //敌人坦克在下面
                            return false;
                        }
                    } else { //敌人坦克向左向右情况
                        if (Math.abs(this.getX() - enemyTanks.get(i).getX()) <= 50
                                && enemyTanks.get(i).getY() - this.getY() <= 50
                                && enemyTanks.get(i).getY() - this.getY() > 0) { //敌人坦克在下面
                            return false;
                        }
                    }
                }
                return true;
            case 2: //向左
                for (int i = 0; i < enemyTanks.size(); i++) {
                    if (enemyTanks.get(i).getDirection() >= 2) {//敌人坦克向左向右情况
                        if (Math.abs(this.getY() - enemyTanks.get(i).getY()) <= 40
                                && this.getX() - enemyTanks.get(i).getX() <= 60
                                && this.getX() - enemyTanks.get(i).getX() > 0) { //敌人坦克在左面
                            return false;
                        }
                    } else { //敌人坦克向上向下情况
                        if (Math.abs(this.getY() - enemyTanks.get(i).getY()) <= 50
                                && this.getX() - enemyTanks.get(i).getX() <= 50
                                && this.getX() - enemyTanks.get(i).getX() > 0) { //敌人坦克在左面
                            return false;
                        }
                    }
                }
                return true;
            case 3: //向右
                for (int i = 0; i < enemyTanks.size(); i++) {
                    if (enemyTanks.get(i).getDirection() >= 2) {//敌人坦克向左向右情况
                        if (Math.abs(this.getY() - enemyTanks.get(i).getY()) <= 40
                                && enemyTanks.get(i).getX() - this.getX() <= 60
                                && enemyTanks.get(i).getX() - this.getX() > 0) { //敌人坦克在右面
                            return false;
                        }
                    } else { //敌人坦克向上向下情况
                        if (Math.abs(this.getY() - enemyTanks.get(i).getY()) <= 50
                                && enemyTanks.get(i).getX() - this.getX() <= 50
                                && enemyTanks.get(i).getX() - this.getX() > 0) { //敌人坦克在右面
                            return false;
                        }
                    }
                }
                return true;
            default:
                break;
        }
        return true;
    }


    public Vector<MyBullet> getMyBullets() {
        return myBullets;
    }

    public void setMyBullets(Vector<MyBullet> myBullets) {
        this.myBullets = myBullets;
    }

    public Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    public int reduceHealth() {
        return --health;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        MyTank.health = health;
    }
}
