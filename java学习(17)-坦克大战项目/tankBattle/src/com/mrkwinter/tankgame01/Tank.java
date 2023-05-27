package com.mrkwinter.tankgame01;

/**
 * @author MrkWinter
 * @version 1.0
 * 所有坦克的父类
 */
public class Tank {
    private int direction = 0;
    private int speed = 4;
    private int x;
    private int y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        this.y -= speed;
    }
    public void moveDown() {
        this.y +=speed;
    }
    public void moveLeft() {
        this.x-=speed;
    }
    public void moveRight() {
        this.x+=speed;
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
}
