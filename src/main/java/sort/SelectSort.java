package sort;

/**
 * @author lk
 * 2018/8/4 14:25
 * @description:
 */
public class SelectSort {
    public static int[] qK(int[] o) {
        for (int i = 0; i < o.length - 1; i++) {
            for (int j = i + 1; j < o.length; j++) {
                int max = 0;
                if (o[i] < o[j]) {
                    max = o[j];
                    o[j] = o[i];
                    o[i] = max;
                }
            }
        }
        return o;
    }

    // a = 0 b = 9
    private static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    public static void qks(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            //每一趟循环比较时，min用于存放较小元素的数组下标，
            // 这样当前批次比较完毕最终存放的就是此趟内最小的元素
            // 的下标，避免每次遇到较小元素都要进行交换。
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //进行交换，如果min发生变化，则进行交换
            if (min != i) {
                swap(arr, min, i);
            }
        }
    }

    //冒泡
    public static void lklklk(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            //设定一个标记，若为true，则表示此次
            //循环没有进行交换，也就是待排序列已经有序，排序已然完成。
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {9, 1, 0, 2, 70};
//        qks(a);
        lklklk(a);
        for (Integer i : a) {
            System.out.println(i);
        }
    }
}

