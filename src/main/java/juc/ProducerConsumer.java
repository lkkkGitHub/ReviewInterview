package juc;

/**
 * @author lk
 * 2018/11/8 22:42
 * @description:
 */
public class ProducerConsumer {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Products products = new Products(clerk);
        Consumer consumer = new Consumer(clerk);
        new Thread(products, "生产者").start();
        new Thread(consumer, "消费者").start();
        new Thread(products, "生产者1").start();
        new Thread(consumer, "消费者1").start();
    }
}

class Clerk {
    private int product = 0;

    public synchronized void get() {
        while (product <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        System.out.println(Thread.currentThread().getName() + " " + --product);
    }

    public synchronized void set() {
        while (product > 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        System.out.println(Thread.currentThread().getName() + " " + ++product);
    }
}

class Products implements Runnable {
    private Clerk clerk;

    public Products(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            clerk.set();
        }
    }
}

class Consumer implements Runnable {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            clerk.get();
        }
    }
}
