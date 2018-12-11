package interviewtopic.二维数组查找值;

/**
 * @author lk
 * 2018/8/13 11:39
 * @description:
 */
public class test {

    private int len = 0;
    private int row = 0;
    private boolean check = false;
    private Integer[][] a = {
            {1, 6, 8, 9},
            {10, 12, 18, 19},
            {21, 25, 29, 30},
            {31, 35, 36, 39},
            {48, 49, 56, 59}
    };
//    private Stream<Integer[]> stream = Stream.of(a);

    public void findTopic(int num) {
        int len = 0;
        int row = a[0].length - 1;
        boolean check = false;
        while (len < a.length && row >= 0 && !check) {
            if (num < a[len][row]) {
                row--;
            } else if (num > a[len][row]) {
                len++;
            } else if (num == a[len][row]) {
                check = true;
                System.out.println("len: " + len + " row: " + row);
            }
        }
        if (!check) {
            System.out.println("没有数据");
        }
    }

    public void find(int num) {
//        stream.forEach(i -> System.out.println(i));
        int i = a.length - 1;
        int j = 0;
        boolean check = false;
        while (i >= 0 && j < a[0].length && check == false) {
            if (a[i][j] == num) {
                len = i;
                row = j;
                check = true;
            } else if (a[i][0] < num) {
                j++;
            } else if (a[i][0] > num) {
                i--;
            }
        }
        if (check != true) {
            System.out.println("没有找到");
        } else {
            System.out.println("len: " + len + "  row: " + row);
        }
    }

    public void findPlus(int num) {
        int i = 0;
        int j = a.length - 1;
        int mid = 0;
        while (i <= j && check == false) {
            mid = (i + j) / 2;
            if (a[mid][0] - num > 0) {
                if (mid == i) {
                    binarySearch(0, a[0].length - 1, mid, num);
                } else {
                    if (a[mid - 1][0] - num < 0) {
                        binarySearch(0, a[0].length - 1, mid - 1, num);
                    } else {
                        j = mid - 1;
                    }
                }
            } else if (a[mid][0] - num < 0) {
                if (mid == j) {
                    binarySearch(0, a[0].length - 1, mid, num);
                } else {
                    if (a[mid + 1][0] - num > 0) {
                        binarySearch(0, a[0].length - 1, mid, num);
                    } else {
                        i = mid + 1;
                    }
                }
            } else if (a[mid][0] == num) {
                len = mid;
                row = 0;
                check = true;
            }
        }
        if (check != true) {
            System.out.println("没有找到");
        } else {
            System.out.println("len: " + len + "  row: " + row);
        }
    }

    public void binarySearch(int start, int end, int lenMid, int num) {
        int mid = 0;
        while (start <= end && check == false) {
            mid = (start + end) / 2;
            if (a[lenMid][mid] == num) {
                len = lenMid;
                row = mid;
                check = true;
            } else if (a[lenMid][mid] > num) {
                end = mid - 1;
            } else if (a[lenMid][mid] < num) {
                start = mid + 1;
            }
        }
    }
}
