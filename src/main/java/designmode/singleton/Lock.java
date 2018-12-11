package designmode.singleton;

/**
 * @author lk
 * 2018/8/23 9:30
 * @description:
 */
public class Lock {
    private static volatile Lock lock = null;

    private Lock(){
    }

    public static Lock getLock() {
        if(lock == null) {
            synchronized (Lock.class) {
                if (lock == null) {
                    lock = new Lock();
                }
            }
        }
        return lock;
    }
}
