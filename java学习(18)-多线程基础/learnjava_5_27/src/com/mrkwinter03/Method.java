package com.mrkwinter03;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Method {
    public static void main(String[] args) throws InterruptedException{
        AA aa = new AA();
        Thread thread = new Thread(aa);
        //1. 设置线程名
        thread.setName("三月七");
        //2. 获取线程名
        System.out.println(thread.getName());
        //3. 设置 获取 线程优先级
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getPriority());
        //4. 启动线程
        thread.start();
        //5. 休眠线程
        Thread.sleep(1000* 4);
        //6. 中断线程 结束线程休眠
        thread.interrupt();
        //8. run方法 由start0调用 线程对象的run方法


    }
}
class AA implements Runnable {
    private boolean loop = true;
    @Override
    public void run() {
        while(loop) {
            System.out.println("我是三月七小姐的狗！！！");
            try {
                Thread.sleep(1000 * 20);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "线程被中断");
            }
        }
    }
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}