package designmode.singleton;

/**
 * @author lk
 * 2018/8/11 11:20
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        CreateThread createThread = new CreateThread();
        Thread t1 = new Thread(createThread, "t1");
        Thread t2 = new Thread(createThread, "t2");
        Thread t3 = new Thread(createThread, "t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
