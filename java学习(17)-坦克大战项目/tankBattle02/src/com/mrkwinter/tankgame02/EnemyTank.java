package com.mrkwinter.tankgame02;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class EnemyTank extends Tank implements Runnable {
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while(true) {
            int step = 4 + (int)(Math.random()*16+1);
            switch((int)(Math.random()*4)) {
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
                default:
                    break;
            }
        }
    }
}
