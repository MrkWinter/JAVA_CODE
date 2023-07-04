package com.mrkwinter.tankgame02;

import java.util.Vector;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class MyBullet extends FireBullet implements Runnable {
    private boolean isLive = true;
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

    public boolean isLive() {
        return this.isLive;
    }

    @Override
    public void run() {
        while (getX() >= 0 && getX() <= 1000 && getY() >= 0 && getY() <= 750) {
            bulletMove();
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                switch (enemyTank.getDirection()) {
                    case 0:
                    case 1:
                        if (getX() > enemyTank.getX() - 20 && getX() < enemyTank.getX() + 20
                                && getY() > enemyTank.getY() - 30 && getY() < enemyTank.getY() + 30) {
                            enemyTanks.remove(i);
                            resetBullet();
                        }
                        break;
                    case 2:
                    case 3:
                        if (getX() > enemyTank.getX() - 30 && getX() < enemyTank.getX() + 30
                                && getY() > enemyTank.getY() - 20 && getY() < enemyTank.getY() + 20) {
                            enemyTanks.remove(i);
                            resetBullet();
                        }
                        break;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isLive = false;
    }
}