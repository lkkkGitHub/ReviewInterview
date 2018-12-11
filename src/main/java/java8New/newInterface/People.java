package java8New.newInterface;

/**
 * @author lk
 * 2018/9/5 20:13
 * @description:
 */
public interface People {
    int A = 0;

    static void printA() {
        System.out.println("A: " + A + " People static method");
    }

    public void initB();

    default void printAB() {
        System.out.println("A: " + A + " People default method");
    }
}
