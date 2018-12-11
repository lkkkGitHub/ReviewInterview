package thread.synchronizedThread;

/**
 * @author lk
 * 2018/8/14 16:09
 * @description:
 */
public class SynchronizedTest implements Runnable {

    private Object object;
    private Object object1;

    public SynchronizedTest(Object object, Object object1) {
        this.object = object;
        this.object1 = object1;
    }

    @Override
    public void run() {
        int count = 5;
        while (count > 0) {
            synchronized (object) {
                synchronized (object1) {
                    System.out.println(Thread.currentThread().getName());
                    count--;
                    object1.notify();
                }
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedTest t1 = new SynchronizedTest(3, 1);
        SynchronizedTest t2 = new SynchronizedTest(1, 2);
        SynchronizedTest t3 = new SynchronizedTest(2, 3);
        Thread thread = new Thread(t1, "3");
        Thread thread1 = new Thread(t2, "4");
        Thread thread2 = new Thread(t3, "5");
        thread.start();
        try {
            thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
        try {
            thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
