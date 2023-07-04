package com.mrkwinter.tankgame03;

import java.util.Vector;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class MyBullet extends FireBullet implements Runnable {
    private Vector<EnemyTank> enemyTanks = null;

    public MyBullet(int x, int y, int direction, Vector<EnemyTank> enemyTanks) {
        super(x, y, direction);
        this.enemyTanks = enemyTanks;
    }

    public Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }


    @Override
    public void run() {
        while (getX() >= 0 && getX() <= 1000 && getY() >= 0 && getY() <= 750) {
            bulletMove();
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                if(hitTank(enemyTank,this)) {
                    enemyTank.setLive(false);
                    enemyTanks.remove(i);
                    Recorder.addDestroyTankNum();
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        setLive(false);
    }
}