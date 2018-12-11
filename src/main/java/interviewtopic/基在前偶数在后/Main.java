package interviewtopic.基在前偶数在后;

/**
 * @author lk
 * 2018/8/17 16:58
 * @description:
 */
public class Main {
    Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int end = integers.length - 1;

    public int countNum(Integer[] a, int start) {
        int count = 0;
        while (start < a.length) {
            if (a[start] % 2 == 0) {
                count++;
            }
            start++;
        }
        return count;
    }

    public Integer[] sortNumPlusPlus(Integer[] a, int start) {
        int temp;
        while (start < end) {
            //判断start是否为偶数
            if (a[start] % 2 == 0) {
                //判断start + 1是否为偶数
                if (a[start + 1] % 2 == 0) {
                    //判断从start之后时候还有奇数
                    //没有则跳出循环，有则递归
                    int count = countNum(a, start);
                    if (count == end - start + 1) {
                        break;
                    } else {
                        sortNumPlusPlus(a, start + 1);
                    }
                    //start + 1是奇数，则互换相邻的两个数，start++
                } else {
                    temp = a[start];
                    a[start] = a[start + 1];
                    a[start + 1] = temp;
                    start++;
                }
                //不是偶数则跳过继续遍历
            } else {
                start++;
            }
        }
        return a;
    }

    public Integer[] sortNumPlus(Integer[] a) {
        int end = a.length - 1;
        int temp; //中转数组数据
        int oddSign = 0; //数组中的奇数个数
        //从数组的尾部开始遍历数组
        while (end > 0) {
            //判断时候是偶数，偶数即跳过
            if (a[end] % 2 == 0) {
                end--;
                //找到了基数
            } else {
                int tempEndSign = end - 1; //找到基数之后，新建一个循环找到第一个偶数
                //如果记录基数个数为0，则表示第一个基数，++
                if (oddSign == 0) {
                    oddSign++; //基数++
                }
                //新建循环遍历到第一个偶数
                while (tempEndSign >= 0) {
                    //偶数进入循环
                    if (a[tempEndSign] % 2 == 0) {
                        //将最外层end标记指向偶数位置，替换完成后的第一个基数的位置
                        end = tempEndSign;
                        //有几个基数，则替换几次；新建一个变量存储基数的个数
                        int tempOddSign = oddSign;
                        while (tempOddSign > 0) {
                            //替换，基数的第一个和偶数开始替换
                            temp = a[end + oddSign - tempOddSign + 1];
                            a[end + oddSign - tempOddSign + 1] = a[tempEndSign];
                            a[tempEndSign] = temp;
                            //替换完成之后，临时奇数基数-1
                            tempOddSign--;
                            //此标记指向偶数
                            tempEndSign++;
                        }
                        break;
                        //基数即继续遍历，且记录基数标记++
                    } else {
                        tempEndSign--;
                        oddSign++;
                    }
                }
                //通过end - 1 赋值给标记 当end== 0 是跳出循环
                if (tempEndSign == -1) {
                    break;
                }
            }
        }
        return a;
    }

    public Integer[] sortNum(Integer[] a) {
        if (a.length == 0) {
            System.out.println("数组长度为 0");
            System.exit(0);
        }
        int start = 0;
        int end = a.length - 1;
        int temp = 0;
        while (start != end) {
            //判断start是否为基数，为基数则继续
            //向右遍历，直到找到一个偶数为止
            if (a[start] % 2 != 0) {
                start++;
            } else {
                if (a[end] % 2 == 0) {
                    end--;
                } else {
                    temp = a[end];
                    a[end] = a[start];
                    a[start] = temp;
                    end--;
                    start++;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Main s = new Main();
//        for (Integer integer: s.sortNum(s.integers)) {
//            System.out.print(integer + " ");
//        }

//        for (Integer integer:s.sortNumPlus(s.integers) ) {
//            System.out.print(integer + " ");
//        }
//        System.out.println();

        for (Integer integer:s.sortNumPlusPlus(s.integers, 0)) {
            System.out.print(integer + " ");
        }
    }
}
