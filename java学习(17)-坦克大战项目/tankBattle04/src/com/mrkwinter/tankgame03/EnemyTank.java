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
    private static Vector<EnemyTank> enemyTanks = null;

    public static void setMyTank(MyTank myTank) {
        EnemyTank.myTank = myTank;
    }

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        EnemyTank.enemyTanks = enemyTanks;
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
        if (enemyBullets.size() < 3) {
            EnemyBullet.setMyTank(myTank);
            EnemyBullet enemyBullet = new EnemyBullet(getX(), getY(), getDirection());
            enemyBullets.add(enemyBullet);
            new Thread(enemyBullet).start();
        }
    }

    @Override
    public boolean checkMove() {
        switch (this.getDirection()) {
            case 0:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank == this)
                        continue;
                    if (enemyTank.getDirection() <= 1) { //其他敌人坦克向上下
                        if (Math.abs(this.getX() - enemyTank.getX()) <= 40
                                && this.getY() - enemyTank.getY() <= 60
                                && this.getY() - enemyTank.getY() > 0) {
                            return false;
                        }
                    } else { //其他敌人坦克向左右
                        if (Math.abs(this.getX() - enemyTank.getX()) <= 50
                                && this.getY() - enemyTank.getY() <= 50
                                && this.getY() - enemyTank.getY() > 0) {
                            return false;
                        }
                    }
                }//检测完其他敌人坦克

                //检测自己的坦克
                if (myTank.getDirection() <= 1) {
                    if (Math.abs(this.getX() - myTank.getX()) <= 40
                            && this.getY() - myTank.getY() <= 60
                            && this.getY() - myTank.getY() > 0) {
                        return false;
                    }
                } else {
                    if (Math.abs(this.getX() - myTank.getX()) <= 50
                            && this.getY() - myTank.getY() <= 50
                            && this.getY() - myTank.getY() > 0) {
                        return false;
                    }
                } //都没有问题
                return true;
            case 1:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank == this)
                        continue;
                    if (enemyTank.getDirection() <= 1) { //其他敌人坦克向上下
                        if (Math.abs(this.getX() - enemyTank.getX()) <= 40
                                && enemyTank.getY() - this.getY() <= 60
                                && enemyTank.getY() - this.getY() > 0) {
                            return false;
                        }
                    } else { //其他敌人坦克向左右
                        if (Math.abs(this.getX() - enemyTank.getX()) <= 50
                                && enemyTank.getY() - this.getY() <= 50
                                && enemyTank.getY() - this.getY() > 0) {
                            return false;
                        }
                    }
                }


                if (myTank.getDirection() <= 1) {
                    if (Math.abs(this.getX() - myTank.getX()) <= 40
                            && myTank.getY() - this.getY() <= 60
                            && myTank.getY() - this.getY() > 0) {
                        return false;
                    }
                } else {
                    if (Math.abs(this.getX() - myTank.getX()) <= 50
                            && myTank.getY() - this.getY() <= 50
                            && myTank.getY() - this.getY() > 0) {
                        return false;
                    }
                }
                return true;
            case 2:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank == this)
                        continue;
                    if (enemyTank.getDirection() >= 2) {
                        if (Math.abs(this.getY() - enemyTank.getY()) <= 40
                                && this.getX() - enemyTank.getX() <= 60
                                && this.getX() - enemyTank.getX() > 0) {
                            return false;
                        }
                    } else {
                        if (Math.abs(this.getY() - enemyTank.getY()) <= 50
                                && this.getX() - enemyTank.getX() <= 50
                                && this.getX() - enemyTank.getX() > 0) {
                            return false;
                        }
                    }
                }

                if (myTank.getDirection() >= 2) {
                    if (Math.abs(this.getY() - myTank.getY()) <= 40
                            && this.getX() - myTank.getX() <= 60
                            && this.getX() - myTank.getX() > 0) {
                        return false;
                    }
                } else {
                    if (Math.abs(this.getY() - myTank.getY()) <= 50
                            && this.getX() - myTank.getX() <= 50
                            && this.getX() - myTank.getX() > 0) {
                        return false;
                    }
                }
                return true;
            case 3:
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    if (enemyTank == this)
                        continue;
                    if (enemyTank.getDirection() >= 2) {
                        if (Math.abs(this.getY() - enemyTank.getY()) <= 40
                                && enemyTank.getX() - this.getX() <= 60
                                && enemyTank.getX() - this.getX() > 0) {
                            return false;
                        }
                    } else {
                        if (Math.abs(this.getY() - enemyTank.getY()) <= 50
                                && enemyTank.getX() - this.getX() <= 50
                                && enemyTank.getX() - this.getX() > 0) {
                            return false;
                        }
                    }
                }

                if (myTank.getDirection() >= 2) {
                    if (Math.abs(this.getY() - myTank.getY()) <= 40
                            && myTank.getX() - this.getX() <= 60
                            && myTank.getX() - this.getX() > 0) {
                        return false;
                    }
                } else {
                    if (Math.abs(this.getY() - myTank.getY()) <= 50
                            && myTank.getX() - this.getX() <= 50
                            && myTank.getX() - this.getX() > 0) {
                        return false;
                    }
                }
                return true;
            default:
                break;
        }
        return true;
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
