package com.mrkwinter6;

public class AA extends Template {
    @Override
    public void job() {
        long sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }
    }
}
