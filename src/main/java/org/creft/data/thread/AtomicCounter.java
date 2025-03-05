package org.creft.data.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private final AtomicInteger counter;

    public AtomicCounter(int startValue) {
        this.counter = new AtomicInteger(startValue);
    }

    public void increment(){
        counter.incrementAndGet();
    }
    public int getCount(){
        return counter.get();
    }
}
