package com.mrkwinter.tankgame03;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class EnemyBullet extends FireBullet implements Runnable {

    private static MyTank myTank = null;

    public static void setMyTank(MyTank myTank) {
        EnemyBullet.myTank = myTank;
    }

    public EnemyBullet(int x, int y, int direction) {
        super(x, y, direction);
    }


    @Override
    public void run() {
        while (getX() >= 0 && getX() <= 1000 && getY() >= 0 && getY() <= 750) {
            bulletMove();
            if (hitTank(myTank, this)) {
                if (myTank.reduceHealth() == 0)
                    myTank.setLive(false);
                Recorder.reduceMyTankHealth();
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
