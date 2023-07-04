package com.mrkwinter.tankgame03;

/**
 * @author MrkWinter
 * @version 1.0
 */
//用于存放坦克的坐标位置方向信息
public class Node {
    private int x;
    private int y;
    private int direction;

    public Node(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirection() {
        return direction;
    }
}
