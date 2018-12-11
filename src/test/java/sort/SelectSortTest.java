package sort;

import org.junit.Test;

/**
 * @author lk
 * 2018/10/12 17:18
 * @description:
 */
public class SelectSortTest {

    int[] a = {9, 1, 0, 2, 70};


    public void qKsort() {
        int temp;
        for (int i = 0; i < a.length - 1; i ++) {
            temp = i;
            for (int j = i + 1; j < a.length; j ++) {
                if (a[temp] > a[j]) {
                    temp = j;
                }
                if (temp != i) {
                    a[temp] = a[temp] + a[i];
                    a[i] = a[temp] - a[i];
                    a[temp] = a[temp] - a[i];
                }
            }
        }
    }

    public void qksorts() {
        boolean flag;
        for (int i = 0; i < a.length - 1; i ++) {
            flag = true;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public void mergeSort(int left, int right, int[] a) {
        if (left > right) {
            return;
        }
        //基准数
        int temp = a[left];
        int i = left;
        int j = right;
        while (a[right] >= temp && j < i) {
            j --;
        }
        while (a[left] <= temp && j < i) {
            i ++;
        }
        if (i < j) {
            a[i] = a[j] + a[i];
            a[j] = a[i] - a[j];
            a[i] = a[i] + a[j];
        }
        a[left] = a[j];
        a[j] = temp;
        mergeSort(left, j - 1, a);
        mergeSort(j + 1, right, a);
    }

    @Test
    public void tst() {
//        qKsort();
//        qksorts();
        mergeSort(0, a.length - 1, a);
        for (Integer i: a) {
            System.out.println(i);
        }
    }

}