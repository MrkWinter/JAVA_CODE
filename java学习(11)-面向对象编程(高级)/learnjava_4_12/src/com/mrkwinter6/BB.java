package com.mrkwinter6;


public class BB extends Template {
    public void job() {
        long sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
    }
}
