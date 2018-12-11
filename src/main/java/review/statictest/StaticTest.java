package review.statictest;

/**
 * @author lk
 * 2018/8/10 20:48
 * @description:
 */
public class StaticTest {
    private String name;
    private static String nameLk;

    public void setName(String name) {
        this.name = name;
    }

    public static void setNameLk(String aNameLk) {
        nameLk = aNameLk;
    }

    public StaticTest() {
        System.out.println("gouzaoqi,Test");
    }

    static {
        System.out.println("a");
    }

    static {
        System.out.println("b");
    }
}


