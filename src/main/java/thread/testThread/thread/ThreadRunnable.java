package thread.testThread.thread;

/**
 * @author lk
 * 2018/8/7 20:49
 * @description:
 */
public class ThreadRunnable implements Runnable {


    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "  " + Thread.currentThread().getName());
        }
    }
}
