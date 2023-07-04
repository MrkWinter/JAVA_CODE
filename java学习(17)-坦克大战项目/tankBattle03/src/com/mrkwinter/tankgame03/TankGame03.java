package com.mrkwinter.tankgame03;

import javax.swing.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class TankGame03 extends JFrame {
    private MyPanel mp = null;
    public TankGame03() {
        mp = new MyPanel();
        this.add(mp);
        new Thread(mp).start();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1000,750);
        this.addKeyListener(mp);
    }

    public static void main(String[] args) {
        TankGame03 tankGame01 = new TankGame03();
    }
}
