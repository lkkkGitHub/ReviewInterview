package thread.testThread;

import thread.testThread.thread.ThreadMap;
import thread.testThread.thread.ThreadRunnable;
import thread.testThread.thread.ThreadSet;

import java.sql.SQLOutput;
import java.util.Date;

/**
 * @author lk
 * 2018/8/7 18:23
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        ThreadMap threadMap = new ThreadMap();
        ThreadSet threadSet = new ThreadSet();

        ThreadMap threadMap1 = new ThreadMap();
        threadMap1.start();
        threadMap.start();
        threadSet.start();
        ThreadMap.yield();
        System.out.println("12312312332");

//        try {
//            threadSet.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("adfasdffasdf");
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("i == " + i + "时间：" + new Date().toLocaleString());
//        }
//        ThreadRunnable t1 = new ThreadRunnable();
//        ThreadsRunnable thread = new ThreadsRunnable(t1, "t1");
//        ThreadsRunnable thread1 = new ThreadsRunnable(t1, "t2");
//        thread.start();
//        thread1.start();
//        System.out.println("111111");
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("sfasdfasdfasdf");
    }
}
