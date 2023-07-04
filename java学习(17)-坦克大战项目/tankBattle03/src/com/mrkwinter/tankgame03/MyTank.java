package com.mrkwinter.tankgame03;

import java.util.Vector;

/**
 * @author MrkWinter
 * @version 1.0
 * 我的坦克
 */
@SuppressWarnings("all")
public class MyTank extends Tank {
    private int health = 3;
    private Vector<MyBullet> myBullets = new Vector<>();
    private Vector<EnemyTank> enemyTanks = null;

    public MyTank(int x, int y) {
        super(x, y);
    }

    public void shotBullet() {
        if(myBullets.size()<3) {
           MyBullet myBullet =  new MyBullet(getX(),getY(),getDirection(),enemyTanks);
           myBullets.add(myBullet);
           new Thread(myBullet).start(); //启动子弹线程
        }
    }

//    @Override
//    public boolean checkMove() {
//        for (int i = 0; i < enemyTanks.size(); i++) {
//            EnemyTank enemyTank = enemyTanks.get(i);
//            if(Math.pow(getX()-enemyTank.getX(),2)<360) {
//                return false;
//            }
//        }
//        return true;
//    }

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

    public int getHealth() {
        return health;
    }
}
