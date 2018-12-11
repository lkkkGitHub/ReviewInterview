package review.enumType;

/**
 * @author lk
 * 2018/8/21 11:30
 * @description:
 */
public class EnumTest {


    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest();
        System.out.println(Day.one.name());
    }
}

enum Day {
    one,two;
}