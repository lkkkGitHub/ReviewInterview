package interviewtopic.字符串替换;

/**
 * @author lk
 * 2018/8/13 18:59
 * @description:
 */
public class Replace {
    private String str = " we are happy !";

    char[] chars = {' ', 'w', 'e', ' ', 'a', 'r', 'e', ' ', 'h', 'a', 'p', 'p', 'y'};

    public void replaceSpace() {
        String s = str.replace(" ", "%20");
        System.out.println(s);
    }

    public void replaceSpacePlus() {
        int len = chars.length - 1;
        int type = 0;
        while (len >= 0) {
            if (chars[len] == ' ') {
                type++;
            }
            len--;
        }
        int lastLen = chars.length + type * 2 - 1;//14
        char[] chars1 = new char[chars.length + type * 2];
        int len1 = 0;
        int i = 0;
        while (len1 < chars.length - 1) {
            chars1[i] = chars[len1];
            len1++;
            i++;
        }
        int noLastLen = chars.length - 1;//8
        while (lastLen > 0) {
            if (chars[noLastLen] == ' ') {
                chars1[lastLen--] = '0';
                chars1[lastLen--] = '2';
                chars1[lastLen--] = '%';
                noLastLen--;
            } else {
                chars1[lastLen--] = chars[noLastLen--];
            }
        }
        System.out.println(chars);
        System.out.println(chars1);
    }
}
