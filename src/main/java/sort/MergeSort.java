package sort;

/**
 * @author lk
 * 2018/8/4 15:06
 * @description:
 */
public class MergeSort {
    public void merge(int[] a, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (a[i] >= a[j]) {
                temp[k++] = a[j++];
            } else {
                temp[k++] = a[i++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= end) {
            temp[k++] = a[j++];
        }

        for (int tyep = 0; tyep < temp.length; tyep++) {
            a[start+ tyep] = temp[tyep];
        }
        temp = null;
    }

    public void mergeMid2(int[] a, int start, int end) {
        if (a == null || end <= start) {
            return;
        }
        int mid = (start + end) / 2;
        mergeMid2(a, start, mid);
        mergeMid2(a, mid + 1, end);
        merge(a, start, mid, end);
    }

}
