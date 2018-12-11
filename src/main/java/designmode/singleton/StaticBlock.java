package designmode.singleton;

/**
 * @author lk
 * 2018/8/23 9:21
 * @description:
 */
public class StaticBlock {
    private StaticBlock() {
    }

    private static StaticBlock staticBlock = null;

    static {
         staticBlock = new StaticBlock();
    }

    public static StaticBlock getStaticBlock() {
        return staticBlock;
    }
}
