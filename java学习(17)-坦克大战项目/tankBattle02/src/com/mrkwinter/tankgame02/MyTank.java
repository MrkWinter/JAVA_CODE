package com.mrkwinter.tankgame02;

import java.util.Vector;

/**
 * @author MrkWinter
 * @version 1.0
 * 我的坦克
 */
public class MyTank extends Tank {
    private MyBullet myBullet = null;
    private Vector<EnemyTank> enemyTanks = null;

    public MyTank(int x, int y) {
        super(x, y);
    }

    public void shotBullet() {
        if (myBullet == null || !myBullet.isLive()) {
            myBullet = new MyBullet(getX(), getY(), getDirection(), enemyTanks);
            new Thread(myBullet).start();
        }
    }


    public MyBullet getMyBullet() {
        return myBullet;
    }

    public void setMyBullet(MyBullet myBullet) {
        this.myBullet = myBullet;
    }

    public Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }
}
