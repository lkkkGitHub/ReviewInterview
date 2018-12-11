package review.automaticpacking;

import org.junit.Test;

/**
 * @author lk
 * 2018/8/3 19:16
 * @description:
 */
public class AutomaticPackingTest {

    AutomaticPacking packing = new AutomaticPacking();
    @Test
    public void auto() {
        packing.auto();
    }

    @Test
    public void shuzu() {
        packing.shuzu();
    }

    @Test
    public void sets() {
        packing.Sets();
    }

    @Test
    public void interger() {
        packing.Interger();
    }
}