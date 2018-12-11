package interviewtopic.twoarraysort;

import java.util.stream.Stream;

/**
 * @author lk
 * 2018/8/14 19:26
 * @description:
 */
public class TwoArraySort {
    private int[] a = {2, 4, 7, 9, 48, 98};
    private int[] b = {5, 6, 10, 11};

    public void sort() {
        Integer[] c = new Integer[a.length + b.length];
        int cLen = c.length - 1;
        int aLen = a.length - 1;
        int bLen = b.length - 1;
        while (cLen >= 0) {
            if (aLen >= 0 && bLen >= 0) {
                if (a[aLen] > b[bLen]) {
                    c[cLen--] = a[aLen--];
                } else if (a[aLen] <= b[bLen]) {
                    c[cLen--] = b[bLen--];
                }
            } else {
                if (aLen < 0) {
                    c[cLen--] = b[bLen--];
                } else {
                    c[cLen--] = a[aLen--];
                }
            }
        }
        Stream<Integer> stream = Stream.of(c);
        stream.forEach(s -> System.out.print(s + " "));
    }
}

