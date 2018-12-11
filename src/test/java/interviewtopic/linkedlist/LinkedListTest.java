package interviewtopic.linkedlist;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @author lk
 * 2018/8/16 10:01
 * @description:
 */
public class LinkedListTest {

    LinkedList linkedList = new LinkedList();

    @Test
    public void initList() {
//        Stream<Integer> stream = Stream.of(LinkedList.a);
//        stream.forEach(i -> System.out.print(i + " "));
//        System.out.println();
        linkedList.initList(LinkedList.a);
    }
}