package review.trycatchfinally;

/**
 * @author lk
 * 2018/8/13 8:50
 * @description:
 */
public class Order {
    int i = 0;
    public int orderLk() {
        try {
            i = 1;
            System.out.println("try");
            System.exit(0);
            return i;
        } catch (Exception e) {
            i = 2;
            System.out.println("catch");
            return i;
        } finally {
            i = 3;
            System.out.println("finally");
            return i;
        }
    }
    public void print() {
        System.out.println(i);
    }
}
