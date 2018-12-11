package juc;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author lk
 * 2018/11/10 8:25
 * 读写锁
 */
public class TestReadWriteLock {
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    private int number;

    public void get() {
        lock.readLock().lock();
        try {
            System.out.print(Thread.currentThread().getName() + "  " + number);
            Thread.sleep(200);
            System.out.println("-------------");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void setNumber(int number) {
        lock.writeLock().lock();
        try {
            this.number = number;
            System.out.println(Thread.currentThread().getName() + " " + number);
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {
        TestReadWriteLock testReadWriteLock = new TestReadWriteLock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    testReadWriteLock.get();
                }
            }
        }, "readA").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    testReadWriteLock.get();
                }
            }
        }, "readB").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    testReadWriteLock.setNumber(i);
                }
            }
        }, "write").start();
    }
}
