package sort;

/**
 * @author lk
 * 2018/8/8 14:07
 * @description: 快速拍寻
 */
public class QkSort {
    public void qkSortMethod(int left, int reight, int[] a) {
        if (left > reight) {
            return;
        }
        int type;
        int temp = a[left];
        int i = left;
        int j = reight;
        while (i != j) {
            while (a[j] >= temp && j > i) {
                j--;
            }
            while (a[i] <= temp && i < j) {
                i++;
            }
           if (i < j) {
               type = a[i];
               a[i] = a[j];
               a[j] = type;
           }
        }
        a[left] = a[j];
        a[j] = temp;
        qkSortMethod(left, j - 1, a);
        qkSortMethod(j + 1, reight, a);
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 11, 9, 7, 6, 10, 16};
        QkSort qkSort = new QkSort();
        qkSort.qkSortMethod(0, a.length - 1, a);
        for (Integer i: a) {
            System.out.println(i);
        }
    }
}
