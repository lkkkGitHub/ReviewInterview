package review.dataconversion;

/**
 * @author lk
 * 2018/10/8 9:53
 * @description:
 */
public class AutomaticConversion {

    public void byteShortChar() {
        byte b = 1;
        byte b1 = 1;

        short s = 2;
        short s1 = 3;

        char c1 = '4';
        char c = '3';

        long l = 10l;
        long ll = 10L;
    }

    public void byteToByte() {
        Integer integer = 1;
        int i = 2;
        String s = String.valueOf(i);
    }

    public static void main(String[] args) {
        AutomaticConversion automaticConversion = new AutomaticConversion();
        automaticConversion.byteShortChar();
    }
}
