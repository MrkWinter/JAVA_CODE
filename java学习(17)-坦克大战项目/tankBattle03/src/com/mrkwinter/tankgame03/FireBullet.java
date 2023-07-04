package com.mrkwinter.tankgame03;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class FireBullet {
    private int x;
    private int y;
    private int direction;
    private int speed = 4;
    private boolean isLive = true;

    public FireBullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void bulletMove() {
        switch (direction) {
            case 0:
                y -= speed;
                break;
            case 1:
                y += speed;
                break;
            case 2:
                x -= speed;
                break;
            case 3:
                x += speed;
                break;
            default:
                break;
        }
    }

    public void resetBullet() {
        x = -1;
        y = -1;
    }

    public boolean hitTank(Tank tank, FireBullet bullet) {
        if (!tank.isLive()) {
            return false;
        }
        switch (tank.getDirection()) {
            case 0:
            case 1:
                if (bullet.getX() > tank.getX() - 20 && bullet.getX() < tank.getX() + 20
                        && bullet.getY() > tank.getY() - 30 && bullet.getY() < tank.getY() + 30) {
                    bullet.resetBullet();
                    MyPanel.bombs.add(new Bomb(tank.getX(), tank.getY()));//击中子弹 留下炸弹
                    return true;
                }
                break;
            case 2:
            case 3:
                if (bullet.getX() > tank.getX() - 30 && bullet.getX() < tank.getX() + 30
                        && bullet.getY() > tank.getY() - 20 && bullet.getY() < tank.getY() + 20) {
                    bullet.resetBullet();
                    MyPanel.bombs.add(new Bomb(tank.getX(), tank.getY()));
                    return true;
                }
                break;
        }
        return false;
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

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
}

