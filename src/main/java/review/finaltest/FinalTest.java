package review.finaltest;

/**
 * @author lk
 * 2018/8/31 10:31
 * @description:
 */
public class FinalTest {

    public static void main(String[] args) {
        final int i = 0;
        //编译报错，i是基本类型，没有引用对象
        //System.out.println(i++);
        final StringBuffer stringBuffer = new StringBuffer("ad");
        stringBuffer.append("a");
    }
}
