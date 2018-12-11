package review.instanceof1;

import org.junit.Test;

/**
 * @author lk
 * 2018/8/4 10:37
 * @description:
 */
public class InstanceofTest {

    private Instanceof anInstanceof = new Instanceof();
    @Test
    public void instanceOf() {
        anInstanceof.instanceOf();
    }
    @Test
    public void Math() {
        System.out.println(Math.round(1.2));
        System.out.println(Math.round(1.6));
        System.out.println(Math.round(-1.5));
        System.out.println(Math.round(-1.6));

        int [] a = new int[4];
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        System.out.println(a.length);
    }

}