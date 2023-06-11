package com.mrkwinter3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class ObjectInputStream01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.dat"));
        //下面进行反序列化
        //反序列化时得到的对象顺序应和序列化时保持一致
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readUTF());
        Object o = objectInputStream.readObject(); //需要抛出类型转换异常
        ObjectOutputStream01.Dog dog = (ObjectOutputStream01.Dog) o; //向下转型
//        //反序列化得到的Dog 是序列化时的Dog 如果有一点信息(类中方法属性 类的所在包等)
//        // 不一样 就会出现错误
        System.out.println(dog);
        objectInputStream.close();

    }
}
