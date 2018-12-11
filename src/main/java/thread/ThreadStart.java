package thread;

import java.util.Hashtable;

/**
 * @author lk
 * 2018/8/6 20:00
 * @description:
 */
public class ThreadStart implements Runnable {
    Hashtable<String, String> hashtable = new Hashtable<String, String>();
    int i = 0;
    public void setHashtable () {
        for (int i = 0; i <= 10; i++) {
            hashtable.put("key" + i, "value" + i);
        }
    }
    /**
     * 线程执行的方法
     */
    public void run() {
        for (String s: hashtable.keySet()) {
            System.out.println(s + "==" + hashtable.get(s));
            System.out.println(i);
            i++;
        }
    }
}

class ThreadRun extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "========");
        }
    }
}

class main{
    public static void main(String[] args) {
//        创建对象，将对象赋值给Thread类，然后调用Thread类的start方法运行线程，调用start方法会再主线程main
//        中再创建一个线程，与主线程同步运行
        ThreadStart threadStart = new ThreadStart();
        threadStart.setHashtable();
        Thread thread = new Thread(threadStart);
        thread.start();
//        直接调用线程的run方法，不会创建新线程，main线程运行到run时，进入run方法运行完run之后，再运行main线程
//        ThreadStart threadStart = new ThreadStart();
//        threadStart.setHashtable();
//        threadStart.run();
        ThreadRun threadRun = new ThreadRun();

        for (int i = 100; i <= 200; i++) {
            if (threadRun.isAlive()) {
                System.out.println("lklklklklklklk");
            } else {
                System.out.println("qwerqwerqwrwqrqwerqwerqwrerqwer");
            }
            System.out.println(i);
        }

        try {

            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadRun.start();
//        System.out.println(threadRun.getPriority());
//        threadRun.run();
        for (int i = 10; i <= 20; i++) {
            if (threadRun.isAlive()) {
                System.out.println("lklklklklklklk");
            } else {
                System.out.println("qwerqwerqwrwqrqwerqwerqwrerqwer");
            }
            System.out.println(i);
        }
    }
}