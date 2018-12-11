package juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author lk
 * 2018/11/9 8:09
 * @description:
 */
public class TestCyclicBarrier {
    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, new Runnable() {
            @Override
            public void run() {
                System.out.println("七个法师");
                get();
            }
        });
        for (int i = 0; i < 7; i++) {
            int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("第 " + index + "个");
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public static void get() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, new Runnable() {
            @Override
            public void run() {
                System.out.println("收集龙珠");
            }
        });
        for (int i = 0; i < 7; i++) {
            int type = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(type);
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
