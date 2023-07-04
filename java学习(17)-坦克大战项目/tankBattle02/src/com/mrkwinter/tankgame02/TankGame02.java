package com.mrkwinter.tankgame02;

import javax.swing.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class TankGame02 extends JFrame {
    private MyPanel mp = null;
    public TankGame02() {
        mp = new MyPanel();
        this.add(mp);
        new Thread(mp).start();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1000,750);
        this.addKeyListener(mp);
    }

    public static void main(String[] args) {
        TankGame02 tankGame01 = new TankGame02();
    }
}
