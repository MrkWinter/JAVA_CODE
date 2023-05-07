package com.mrkwinter04;

import java.math.BigInteger;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //BigInteger类可以存储较大的数据
        //存储时以字符串传入 在内部处理数据
        //BigInteger 对象不能直接进行数据运算 要调用方法进行运算
        BigInteger b1 = new BigInteger("1000000000000000000000000");
        BigInteger b2 = new BigInteger("100000000000000000");
        b1 = b1.add(b2);
        System.out.println(b1); //1000000100000000000000000
        b1 = b1.subtract(b2);
        System.out.println(b1);//1000000000000000000000000
        b1 = b1.multiply(b2);
        System.out.println(b1);//100000000000000000000000000000000000000000
        b1 = b1.divide(b2);
        System.out.println(b1);//1000000000000000000000000

    }
}

