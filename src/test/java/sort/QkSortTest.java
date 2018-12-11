package sort;

import org.junit.Test;

/**
 * @author lk
 * 2018/8/4 14:31
 * @description:
 */
public class QkSortTest {

    private SelectSort qkSort = new SelectSort();
    @Test
    public void qK() {
        int[] a = {2, 3, 8, 7, 3};
        int[] b;
        b = SelectSort.qK(a);
        for (Integer integer: b) {
            System.out.println(integer);
        }
        for (Integer integer: a) {
            System.out.println(integer);
        }
        System.out.println(b.hashCode() + "  " + a.hashCode());
    }
}