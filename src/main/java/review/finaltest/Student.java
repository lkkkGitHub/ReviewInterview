package review.finaltest;

/**
 * @author lk
 * 2018/8/10 19:58
 * @description:
 */
public class Student {

    String name;
    final String s = "123";
    final int a = 1;

    private static final Integer STR;

    static {
        STR = 1;
    }

    private final void setName(final int name) {
        Integer.valueOf(s);
    }

    final String str1 = "lk";
    final String str2 = "kk";
//    private String name = str1 + str2;
}
