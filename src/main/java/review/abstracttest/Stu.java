package review.abstracttest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lk
 * 2018/8/10 19:50
 * @description:
 */
public class Stu extends People {
    public Stu(String name, String password) {
        super(name, password);
    }

    int i = 0;

    @Override
    public void printInfo() {
    }

    static {
        System.out.println("stu init");
    }

    public static void method() {
        System.out.println("static method");
    }

    public void printInfoa(int i) {
        i++;
        System.out.println(i);
    }

    public int getI() {
        return i;
    }

    /*
     * 将时间转换为时间戳
     */
    public static String dateToStamp(String s) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
//        Stu stu = new Stu("sd", "s");
//        stu.printInfoa(stu.getI());
//        System.out.println(stu.i);
//        method();
//        People.lk();
        Teacher.teacher();
    }
}
