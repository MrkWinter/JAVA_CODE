package com.mrkwinter6;
//模板设计模式
public abstract class Template {
    public abstract void job();
    //模板类中实现 计算运算时间
    public long getListTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        return (end - start);
    }
}
