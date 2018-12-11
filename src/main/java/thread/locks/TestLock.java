package thread.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lk
 * 2018/10/27 10:34
 * @description:
 */
public class TestLock {
    private Lock lock = new ReentrantLock();

    private void print() {
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "：   获取锁");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + "：   释放锁");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        TestLock testLock = new TestLock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                testLock.print();
            }
        }, "a").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                testLock.print();
            }
        }, "b").start();
    }
}
