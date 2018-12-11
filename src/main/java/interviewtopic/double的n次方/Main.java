package interviewtopic.double的n次方;

/**
 * @author lk
 * 2018/8/17 16:28
 * @description:
 */
public class Main {

    public static double count(double base, int n) {
        for (int i = 0; i < n - 1; i++) {
            base *= base;
        }
        return base;
    }

    public static double countPlus(double base, int n) {
        
        return base;
    }

    public static void main(String[] args) {
        System.out.println(Main.count(7.5, 2));
    }
}
