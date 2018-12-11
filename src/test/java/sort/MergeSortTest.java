package sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lk
 * 2018/8/4 15:20
 * @description:
 */
public class MergeSortTest {
    MergeSort sort = new MergeSort();
    @Test
    public void mergeSort() {
        int[] a = {5, 34, 45, 22, 1};
//        sort.mergeSort(a, 1, 5);
        sort.mergeMid2(a, 0, 4);
        for (Integer o: a) {
            System.out.println(o);
        }
    }

    @Test
    public void sort () {
        System.out.println(3 / 2);
        System.out.println(1 / 2);
    }
}