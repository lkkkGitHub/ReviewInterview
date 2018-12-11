package interviewtopic.twostacktoarray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lk
 * 2018/8/14 15:37
 * @description:
 */
public class TwoStackToArrayTest {

    TwoStackToArray twoStackToArray = new TwoStackToArray();

    @Test
    public void push() {
        twoStackToArray.push(1);
        twoStackToArray.push(2);
        twoStackToArray.push(3);
        System.out.println(twoStackToArray.pop());
        twoStackToArray.push(4);
        System.out.println(twoStackToArray.pop());
    }
}