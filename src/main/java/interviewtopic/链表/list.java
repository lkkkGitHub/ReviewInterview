package interviewtopic.链表;

import java.util.Stack;

/**
 * @author lk
 * 2018/8/13 19:08
 * @description:
 */
public class list {

    Stack<Linked> stack = new Stack<>();

    public void init() {
        Linked linked = new Linked(1);
        Linked linked1 = new Linked(2);
        Linked linked2 = new Linked(3);
        Linked linked3 = new Linked(4);
        linked.next = linked1;
        linked1.next = linked2;
        linked2.next = linked3;
        stack.push(linked);
        stack.push(linked1);
        stack.push(linked2);
        stack.push(linked3);
        int i = 0;
        while (i < stack.size()) {
            System.out.println(stack.pop().value);
        }
    }
}


class Linked {
    Integer value;
    Linked next = null;

    public Linked(Integer value) {
        this.value = value;
    }
}