package designmode.singleton;

/**
 * @author lk
 * 2018/8/23 9:23
 * @description:
 */
public class StaticInnerClass {
    private StaticInnerClass() {
    }

    private static class InnerClass {
        private static StaticInnerClass staticInnerClass = new StaticInnerClass();
    }

    public static StaticInnerClass getStaticInnerClass() {
        return InnerClass.staticInnerClass;
    }
}
