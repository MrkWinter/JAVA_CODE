package com.mrkwinter04;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        //BigDecimal类可以保存较大精度的小数
        //同样 存入时以字符串形式存入
        //数据的运算也需要调用相应的方法
        //在数据进行除法时可能会出现异常 可在divide方法中添加参数 BigDecimal.ROUND_CEILING
        //计算结果保留分子的精度
        BigDecimal b3 = new BigDecimal("12.283932233231123131");
        BigDecimal b4 = new BigDecimal("3.2232112231");
        b3 = b3.divide(b4,BigDecimal.ROUND_CEILING);
        System.out.println(b3); //3.811085089675494290
    }
}
