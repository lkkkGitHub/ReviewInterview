package interviewtopic.twostacktoarray;

import java.util.Stack;

/**
 * @author lk
 * 2018/8/14 15:29
 * @description:
 */
public class TwoStackToArray {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stack1 = new Stack<>();

    /**
     * 将元素压入栈中
     *
     * @param a 元素
     */
    public void push(int a) {
        stack.push(a);
    }

    /**
     * 将stack栈中的元素，取出来放到stack1栈中，然后再将stack1栈中
     * 的第一个值取出并赋值给a
     * 再将stack1中的元素返回到stack栈中，返回a
     * @return “队列”的第一个元素
     */
    public Integer pop() {
        while (!stack.empty()) {
            stack1.push(stack.pop());
        }
        int a = stack1.pop();
        while (!stack1.empty()) {
            stack.push(stack1.pop());
        }
        return a;
    }
}
