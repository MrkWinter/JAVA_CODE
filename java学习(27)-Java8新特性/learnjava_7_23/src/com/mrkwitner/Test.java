package com.mrkwitner;

import java.util.function.Consumer;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //Consumer 接口
        consumerTest(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
        consumerTest((o)-> {System.out.println(o + "  好");});
    }
    public static void consumerTest(Consumer<String> consumer) {
        consumer.accept("你好");
    }
}
