package com.mrkwinter.tankgame03;

import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.util.Vector;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Recorder {
    private static MyTank myTank = null;
    private static Vector<EnemyTank> enemyTanks = null;
    private static int destroyTankNum = 0;
    private static int myTankHealth = MyTank.getHealth();
    private static Vector<Node> positionInformation = null;
    private static BufferedWriter bw = null;
    private static BufferedReader br = null;
    private static String recordFilePath = "myRecord.txt";

    public static void setMyTank(MyTank myTank) {
        Recorder.myTank = myTank;
    }

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    public static int getDestroyTankNum() {
        return destroyTankNum;
    }


    public static int getMyTankHealth() {
        return myTankHealth;
    }

    public static void addDestroyTankNum() {
        Recorder.destroyTankNum++;
    }

    public static void reduceMyTankHealth() {
        Recorder.myTankHealth--;
    }

    public static void recordInformation() throws IOException {
        bw = new BufferedWriter(new FileWriter(recordFilePath));
        bw.write(Integer.toString(destroyTankNum));
        bw.newLine();
        bw.write(Integer.toString(myTankHealth));
        bw.newLine();

        //写入我方坦克的数据
        bw.write(myTank.getX() + " " + myTank.getY() + " " + myTank.getDirection());
        bw.newLine();

        //写入每一个坦克的数据
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            bw.write(enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirection());
            bw.newLine();
        }
        bw.close();
    }

    public static Vector<Node> getAndRecoveryInformateion() throws IOException {
        if(!new File(recordFilePath).exists())
            return null;
        br = new BufferedReader(new FileReader(recordFilePath));
        positionInformation = new Vector<Node>();
        String destroyTankNum = br.readLine();
        Recorder.destroyTankNum = Integer.parseInt(destroyTankNum);
        String myTankhealth = br.readLine();
        Recorder.myTankHealth = Integer.parseInt(myTankhealth);
        //以上为恢复击毁坦克数 以及 坦克剩余生命
        //以下为坦克位置信息
        String positionIf;
        while ((positionIf = br.readLine()) != null) {
            String[] potationArr = positionIf.split(" ");//分割字符串得到位置信息
            positionInformation.add(new Node(Integer.parseInt(potationArr[0]),
                    Integer.parseInt(potationArr[1]), Integer.parseInt(potationArr[2])));
            //在集合中添加Node对象
            //注意第一个坦克是自己坦克的信息
        }
        return positionInformation;
    }
}
