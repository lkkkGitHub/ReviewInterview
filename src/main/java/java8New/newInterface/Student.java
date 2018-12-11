package java8New.newInterface;

/**
 * @author lk
 * 2018/9/5 20:27
 * @description:
 */
public class Student implements People {

    @Override
    public void initB() {
        System.out.println("Student override initB");
    }

    @Override
    public void printAB() {
        System.out.println("student printAB");
    }

    public static void test() {
        System.out.println(((((("1"))))));
    }
}
