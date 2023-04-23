package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //选中代码 ctrl + alt + t 快速实现异常捕获
        try {
            int i = 0;
            System.out.println(i/0);
        } catch (Exception e) {
            throw new RuntimeException(e);
//            System.out.println(e.getMessage());
        }
    }
}
