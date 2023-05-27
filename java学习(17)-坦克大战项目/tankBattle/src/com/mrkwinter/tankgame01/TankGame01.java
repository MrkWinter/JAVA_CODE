package com.mrkwinter.tankgame01;

import javax.swing.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class TankGame01 extends JFrame {
    private MyPanel mp = null;
    public TankGame01() {
        mp = new MyPanel();
        this.add(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1000,750);
        this.addKeyListener(mp);
    }

    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }
}
