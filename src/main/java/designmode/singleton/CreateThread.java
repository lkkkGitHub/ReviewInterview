package designmode.singleton;

/**
 * @author lk
 * 2018/8/11 11:21
 * @description:
 */
public class CreateThread implements Runnable {

    private EnumSingleton singleton = null;

    private void print(EnumSingleton singleton) {
        System.out.println(Thread.currentThread().getName() + "  " + singleton);
    }

    @Override
    public void run() {
        singleton = EnumSingleton.ENUM_SINGLETON;
        print(singleton);
    }
}
