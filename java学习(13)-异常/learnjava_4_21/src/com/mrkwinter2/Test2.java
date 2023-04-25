package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        int age = 19;
        if(age>18) {
            throw new AgeException("年龄超过成年");
        }

    }
}
class AgeException extends RuntimeException {
    public AgeException(String message) {//定义一个自定义异常类 继承运行时异常
        //这个异常类可以传递信息
        super(message);
    }
}