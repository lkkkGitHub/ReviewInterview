package review.statictest;

/**
 * @author lk
 * 2018/8/11 10:04
 * @description:
 */
public class Son extends StaticTest {
    static {
        System.out.println("d");
    }

    private static int a = 1;

    public Son() {
        System.out.println("gouzaoqi son");
    }

    public void setA() {
        System.out.println(a);
        a = 11;
        System.out.println(a);
        a = 12;
        System.out.println(a);
    }
}
