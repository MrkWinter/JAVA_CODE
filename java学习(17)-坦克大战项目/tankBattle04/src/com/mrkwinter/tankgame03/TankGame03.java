package com.mrkwinter.tankgame03;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class TankGame03 extends JFrame {
    private MyPanel mp = null;
    public TankGame03(boolean choice) throws IOException {
        mp = new MyPanel(choice);
        this.add(mp);
        new Thread(mp).start();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(1260,780);
        this.addKeyListener(mp);
        this.addWindowListener(new WindowAdapter() { //添加Window窗口关闭时的监视器
            @Override
            public void windowClosing(WindowEvent e) { //监听到窗口关闭
                try {
                    Recorder.recordInformation();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否继续游戏true/false");
        boolean choice = scanner.nextBoolean();
        TankGame03 tankGame01 = new TankGame03(choice);
    }

}
