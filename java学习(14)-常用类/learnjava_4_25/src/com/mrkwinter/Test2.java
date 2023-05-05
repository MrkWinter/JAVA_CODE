package com.mrkwinter;

import com.sun.javafx.image.IntPixelGetter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Integer i1 = 100;
        //方式1
        String str = i1 + "";
        //方式2
        String str1 = i1.toString();
        //方式3
        String str2 = String.valueOf(i1);

        String str4 = "100";
        //方式1
        Integer i2 = Integer.parseInt(str4);
        //方式2
        Integer i3 = new Integer(str4);
    }
}
