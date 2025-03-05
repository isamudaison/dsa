package org.creft.data.thread;

import java.util.Arrays;
import java.util.List;

public class OddEvenCounter {

    public static List<Thread> getThreadsSyncBlock(int startValue, int counterMax){
        AtomicCounter atomicCounter = new AtomicCounter(startValue);

        Thread oddThread = new Thread(() -> {
            while(atomicCounter.getCount() <= counterMax) {
                if(atomicCounter.getCount() % 2 != 0){
                    System.out.println("Odd Thread: " +atomicCounter.getCount());
                    atomicCounter.increment();
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            while(atomicCounter.getCount() <= counterMax) {
                if(atomicCounter.getCount() % 2 == 0){
                    System.out.println("Even Thread: " +atomicCounter.getCount());
                    atomicCounter.increment();
                }
            }
        });

        return Arrays.asList(oddThread,evenThread);
    }
}
