package com.mrkwinter02;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException{
        AA aa = new AA();
        new Thread(aa).start();
        Thread.sleep(1000*10);
        aa.setLoop(false);
    }
}
class AA implements Runnable {
    private boolean loop = true;
    @Override
    public void run() {
        while(loop) {
            System.out.println("我是三月七小姐的狗！！！");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}