package thread.synchronizedThread;

/**
 * @author lk
 * 2018/8/9 16:12
 * @description:
 */
public class ThreadsRunnable implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    private ThreadsRunnable(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.println(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadsRunnable pa = new ThreadsRunnable("A", c, a);
        ThreadsRunnable pb = new ThreadsRunnable("B", a, b);
        ThreadsRunnable pc = new ThreadsRunnable("C", b, c);

        new Thread(pa).start();
        Thread.sleep(100);  //确保按顺序A、B、C执行
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
    }
}
