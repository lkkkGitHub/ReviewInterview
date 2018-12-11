package interviewtopic.stringint;

/**
 * @author lk
 * 2018/8/10 8:57
 * @description:
 */
public class StringInt {
    public void zhuanhua() {
        String str = "asdfasdf+猪";
        int[] ints = new int[10];
        int type = 0;
        int check = 0;
        int strlength = str.length();
        if (strlength <= 0) {
            System.out.println("The String is null");
        } else {
            while (strlength-- > 0) {
                if (str.charAt(strlength) >= 0 && str.charAt(strlength) <= 127) {
                    System.out.println(str.charAt(strlength) + " == " + Integer.valueOf(str.charAt(strlength)));
                } else {
                    ints[type++] = strlength;
                }
            }
            System.out.println();

            while (check < type) {
                System.out.println(str.charAt(ints[check++]) + " is not a char");
            }
        }
    }
}
