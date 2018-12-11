package interviewtopic.countdata;

/**
 * @author lk
 * 2018/8/10 10:24
 * @description:
 */
public class CountData {
    private int[] ints = {1, 2, 2, 3, 5, 5, 5, 7, 7, 18, 49, 49, 80};
    private int site = 0;
    public void countDataByAHalf(int num) {
        if (ints == null) {
            System.out.println("数组为空");
            return;
        } else {
            int start = 0;
            int end = ints.length - 1;
            aHalf(start, end, num);
            System.out.println(site);
        }
    }

    public void aHalf(int start, int end, int num) {
        if (start <= end) {
            int mid = (start + end) / 2;
//            int mid = start + (num - ints[start] / ((ints[end] - ints[start]) * (end - start)));
            if  (num < ints[start] || num > ints[end]) {
                System.out.println("输入的参数不在数组范围内");
                return;
            }
            if (ints[mid] == num) {
                site += 1;
                int checkLeft = mid;
                while (checkLeft > start) {
                    checkLeft--;
                    if (ints[checkLeft] == num) {
                        site += 1;
                    } else {
                        break;
                    }
                }
                int checkRight = mid;
                while (checkRight < end) {
                    checkRight++;
                    if (ints[checkRight] == num) {
                        site += 1;
                    } else {
                        break;
                    }
                }
            } else if (ints[mid] < num) {
                aHalf(mid + 1, end, num);
            } else {
                aHalf(start, mid - 1, num);
            }
        }
    }
}
