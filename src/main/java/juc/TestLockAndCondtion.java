package juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lk
 * 2018/11/9 9:48
 * abc线程轮流打印一次，使用lock锁的方式
 */
public class TestLockAndCondtion {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private Condition conditionC = lock.newCondition();
    private int number = 1;

    public static void main(String[] args) {
        TestLockAndCondtion testLockAndCondtion = new TestLockAndCondtion();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    testLockAndCondtion.printA();
                }
            }
        }, "A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    testLockAndCondtion.printB();
                }
            }
        }, "B").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    testLockAndCondtion.printC();
                }
            }
        }, "C").start();
    }

    public void printA() {
        lock.lock();
        try {
            if (number != 1) {
                conditionA.await();
            }
            System.out.println(Thread.currentThread().getName());
            number = 2;
            conditionB.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printB() {
        lock.lock();
        try {
            if (number != 2) {
                conditionB.await();
            }
            System.out.println(Thread.currentThread().getName());
            number = 3;
            conditionC.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printC() {
        lock.lock();
        try {
            if (number != 3) {
                conditionC.await();
            }
            System.out.println(Thread.currentThread().getName());
            number = 1;
            conditionA.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
