package com.mrkwinter.tankgame03;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Bomb {
    private int x;
    private int y;
    private int lifeTime = 9;
    private boolean live = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void lifeDown() {
        if(lifeTime>0)
            lifeTime--;
        else
            live = false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public boolean isLive() {
        return live;
    }
}
