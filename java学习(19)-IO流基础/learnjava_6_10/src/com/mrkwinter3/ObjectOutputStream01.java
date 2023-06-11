package com.mrkwinter3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class ObjectOutputStream01 {
    static class Dog implements Serializable {
        String name = "wang";
        int age = 10;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.dat"));

        //.dat 文件是保存序列化 的对象的文件类型
        objectOutputStream.writeInt(100);//100自动装箱成Integer
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeUTF("哈哈哈哈哈");
        objectOutputStream.writeObject(new Dog("wang",2));
        objectOutputStream.close();//关闭处理流
    }
}
