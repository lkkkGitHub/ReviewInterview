package juc;

import java.util.concurrent.CountDownLatch;

/**
 * @author lk
 * 2018/11/8 21:06
 * @description:
 */
public class TestCountDownLatch {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        CountDown countDown = new CountDown();
        countDown.setCountDownLatch(countDownLatch);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            new Thread(countDown).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time " + (end - start));
   }
}

class CountDown implements Runnable {

    private CountDownLatch countDownLatch;

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        if (countDownLatch != null) {
            synchronized (CountDown.class) {
                try {
                    for (int i = 0; i < 50000; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }
        }
    }
}