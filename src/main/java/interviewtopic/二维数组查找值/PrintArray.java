package interviewtopic.二维数组查找值;

/**
 * @author lk
 * 2018/8/21 9:58
 * @description:
 */
public class PrintArray {
    int[][] a = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};

    public void print(int[][] a) {
        int len = 0;
        int row = 0;
        System.out.println("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10");
        printLen(0, 0, a[0].length - 1); //1 2 3  (0~2)
        printRow(a[0].length - 1, 0, a.length - 1); //4 8 12   (3~1
        printLen(a.length - 1, a[0].length - 1, a[0].length - 3); //16 15 14
        printRow(0, a.length - 1, a.length - 3); //13 9 5


        printLen(a.length - 3, a[0].length - 3, a[0].length - 3); //6
        printRow(a[0].length - 2, a.length - 3, a.length - 3); //7
        printLen(a.length - 2, a[0].length - 2, a[0].length - 2); //11
        printRow(a[0].length - 3, a.length - 2, a.length - 2); //10
    }

    void printLen(int len, int start, int end) {
        if (start < end) {
            while (start < end) {
                System.out.print(a[len][start++] + " ");
            }
        } else {
            while (start >= end) {
                System.out.printf(a[len][start--] + " ");
            }
        }
    }

    void printRow(int row, int start, int end) {
        if (start < end) {
            while (start < end) {
                System.out.print(a[start++][row] + " ");
            }
        } else {
            while (start >= end) {
                System.out.printf(a[start--][row] + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintArray p = new PrintArray();
        p.print(p.a);
    }
}
