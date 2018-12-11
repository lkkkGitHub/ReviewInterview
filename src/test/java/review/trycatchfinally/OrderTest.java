package review.trycatchfinally;

import org.junit.Test;

/**
 * @author lk
 * 2018/8/13 8:54
 * @description:
 */
public class OrderTest {

    private Order order = new Order();

    @Test
    public void orderLk() {
        System.out.println(order.orderLk());
        order.print();
    }
}