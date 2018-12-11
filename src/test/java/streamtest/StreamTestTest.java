package streamtest;

import org.junit.Test;

/**
 * @author lk
 * 2018/8/10 16:32
 * @description:
 */
public class StreamTestTest {
    private StreamTest streamTest = new StreamTest();
    @Test
    public void tes() {
        streamTest.forEach();
    }

    @Test
    public void filter() {
        streamTest.filter();
    }

    @Test
    public void distinct() {
        streamTest.distinct();
    }

    @Test
    public void sorted() {
        streamTest.sorted();
    }

    @Test
    public void flatMap() {
        streamTest.flatMap();
    }
}