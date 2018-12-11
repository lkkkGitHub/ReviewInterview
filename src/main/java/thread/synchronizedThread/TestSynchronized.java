package thread.synchronizedThread;

import thread.testThread.thread.ThreadRunnable;

import java.util.Date;

/**
 * @author lk
 * 2018/8/9 16:20
 * @description:
 */
public class TestSynchronized implements Runnable {

    private Byte[] bytes = new Byte[0];
    private String name;
    private String password;

    public synchronized void setName(String name) {
        this.name = name;
        System.out.println(new Date().toLocaleString());
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println(new Date().toLocaleString());
    }

    public void run() {
        synchronized (bytes) {
//            setName("lk");
            bytes.notify();
//            System.out.println(Thread.currentThread());
////            try {
////                Thread.sleep(3000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
            if (Thread.currentThread().getName().equals("1")) {
                try {
                    bytes.wait();
                    System.out.println("t1被唤醒");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            ThreadRunnable threadRunnable = new ThreadRunnable();
            Thread t1 = new Thread(threadRunnable);
            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "=======");
        }
    }

    public static void main(String[] args) {
        TestSynchronized testSynchronized = new TestSynchronized();
//        Son testSynchronized = new Son();   //子类不能继承父类的synchronized方法
        Thread t1 = new Thread(testSynchronized, "1");
        Thread t2 = new Thread(testSynchronized, "2");
        Thread t3 = new Thread(testSynchronized, "3");
        System.out.println("sf");
//        try {
//            Thread.sleep(2000);  //   t1.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("aaa");
        t2.start();
        t1.start();
        t3.start();

    }
}
