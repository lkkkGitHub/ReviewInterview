package designmode.singleton;

/**
 * @author lk
 * 2018/8/23 9:20
 * @description:
 */
public class EagerSingleton {
    private EagerSingleton() {
    }

    private static EagerSingleton eagerSingleton = new EagerSingleton();

    public static EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}
