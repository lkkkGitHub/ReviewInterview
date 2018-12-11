package thread.topic;

/**
 * @author lk
 * 2018/10/20 9:15
 * @description:
 */
public class MainAndSon {

    public static void main(String[] args) {
        addMethod add = new addMethod();
        Thread addOne = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    add.addOne();
                }
            }
        }, "son");
        addOne.start();
        //确保son先执行，main后执行
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread addTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    add.addTwo();
                }
            }
        }, "main");
        addTwo.start();
    }
}

class addMethod {

    private volatile static Integer integer = 0;

    public synchronized void addOne() {
        this.notify();
        for (int i = 0; i < 10; i++) {
            integer++;
            System.out.println(Thread.currentThread().getName() + "执行了" + i);
        }
        System.out.println(integer);
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void addTwo() {
        this.notify();
        for (int i = 0; i < 20; i++) {
            integer++;
            System.out.println(Thread.currentThread().getName() + "执行了" + i);
        }
        System.out.println(integer);
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class One {

    private volatile static One one = null;

    private One() {

    }

    private static One initOne() {
        if (one == null) {
            synchronized (One.class) {
                if (one == null) {
                    return new One();
                }
            }
        }
        return one;
    }

    public static One getOne() {
        return initOne();
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1" + initOne().getClass());
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("2" + initOne().getClass());
            }
        });
        int i = 0;
        thread.start();
        thread1.start();
    }
}