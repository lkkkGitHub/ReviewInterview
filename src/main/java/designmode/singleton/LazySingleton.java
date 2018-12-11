package designmode.singleton;

/**
 * @author lk
 * 2018/8/23 9:15
 * @description:
 */
public class LazySingleton {

    private LazySingleton() {
    }

    private static LazySingleton lazySingleton = null;

    //加入synchronized关键字能保证线程安全，但是效率低下
    public static  LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
