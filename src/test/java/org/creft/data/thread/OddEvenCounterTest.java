package org.creft.data.thread;

import org.junit.jupiter.api.Test;

import java.util.List;

class OddEvenCounterTest {

    @Test
    void getThreads() {

        List<Thread> threads = OddEvenCounter.getThreadsSyncBlock(1,100);

        for(Thread thread : threads)
            thread.start();

    }
}