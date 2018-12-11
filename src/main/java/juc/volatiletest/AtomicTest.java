package juc.volatiletest;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lk
 * 2018/11/5 9:51
 * @description:
 */
public class AtomicTest {
    public static void main(String[] args) {
        AtomicThread atomicThread = new AtomicThread();
        for (int i = 0; i < 10; i++) {
            new Thread(atomicThread).start();
        }
    }
}

class AtomicThread implements Runnable {

    private AtomicInteger atomicInteger = new AtomicInteger(10);

    @Override
    public void run() {
        System.out.println(atomicInteger.getAndIncrement());
    }
}