package thread.threadloacltest;

import java.util.Map;

public class Sort {

    private ThreadLocal<String> sLocal = new ThreadLocal<>();

    public ThreadLocal<String> geThreadLocal() {
        return sLocal;
    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                sort.geThreadLocal().set(Thread.currentThread().getName() + "1");
                sort.geThreadLocal().set(Thread.currentThread().getName() + "2");
                sort.geThreadLocal().set(Thread.currentThread().getName() + "3");
            }
        }, "thread1: ").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                sort.geThreadLocal().set(Thread.currentThread().getName() + "a");
                sort.geThreadLocal().set(Thread.currentThread().getName() + "b");
                sort.geThreadLocal().set(Thread.currentThread().getName() + "c");
            }
        }, "thread2: ").start();
    }
}
