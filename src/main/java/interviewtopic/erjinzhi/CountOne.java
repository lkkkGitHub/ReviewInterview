package interviewtopic.erjinzhi;

/**
 * @author lk
 * 2018/8/17 15:17
 * @description:
 */
public class CountOne {
    public static int getBinaryValue(int n){
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountOne.getBinaryValue(-12));
    }
}
