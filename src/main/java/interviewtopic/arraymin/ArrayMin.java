package interviewtopic.arraymin;

/**
 * @author lk
 * 2018/8/16 15:11
 * @description:
 */
public class ArrayMin {
    int[] a = {9,9,10,45,3,6,9,9};
    int len;
    public int minNum() {
        if (a.length == 0) {
            return 0;
        } else {
            boolean check = false;
            int start = 0;
            int end = a.length - 1;
            int mid;
            while (start <= end && !check) {
                mid = (start + end) / 2;
                if (a[mid] < a[mid - 1] && a[mid] < a[mid + 1]) {
                    check = true;
                    len = mid;
                } else if (a[mid] > a[end]) {
                    start = mid + 1;
                } else if (a[mid] < a[end]) {
                    end = mid - 1;
                } else if (a[mid] == a[end]) {
                    end--;
                }
            }
            return a[len];
        }
    }

}
