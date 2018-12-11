package interviewtopic.stack;


import java.util.LinkedList;
import java.util.List;

/**
 * @author lk
 * 2018/8/22 9:51
 * @description:
 */
public class StackType {
//        java.util.Stack
    private MyStack<Integer> myStack = new MyStack<>();

    private MyStack<Integer> helpStack = new MyStack<>();

    public void getMin(Integer[] a) {
        int i = 0;
        while (i < a.length) {
            if (myStack.size() == 0) {
                myStack.push(a[i]);
                helpStack.push(a[i++]);
            } else {
                if (helpStack.pep() > a[i]) {
                    helpStack.push(a[i]);
                }
                myStack.push(a[i++]);
            }
        }
//        myStack.printObj(); //打印栈中的元素
//        helpStack.printObj(); //辅助栈中的元素
        System.out.println(helpStack.pep());
    }

    public boolean judgeOrder(Integer[] a, Integer[] b) {
        boolean check = true;
        int len = findNum(a, b[0]);
        int i = 1;
        LinkedList<Integer> linkedList = initLinkedList(a);
        while (i < b.length && check) {
            if (len == 0) {
                if (b[i] == a[len + 1]) {
                    linkedList.removeFirst();
                    len = 0;
                } else {
                    check = false;
                }
            } else if (len == linkedList.size() - 1) {
                if (b[i] == a[len - 1]) {
                    linkedList.removeLast();
                    len = linkedList.size() - 1;
                } else {
                    check = false;
                }
            } else {
                if (b[i] == a[len - 1]) {
                    len--;
                    linkedList.remove(len);
                } else if (b[i] == a[len + 1]) {
                    linkedList.remove(len);
                } else if (b[i] != a[len - 1] && b[i] != a[len + 1]) {
                    check = false;
                }
            }
            i++;
        }
        return check;
    }

    public LinkedList<Integer> initLinkedList(Integer[] a) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int i = 0;
        while (i < a.length) {
            linkedList.add(a[i++]);
        }
        return linkedList;
    }

    public int findNum(Integer[] a, int num) {
        boolean check = false;
        int i = 0;
        while (i < a.length && !check) {
            if (num != a[i]) {
                i++;
            } else {
                check = true;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Integer a[] = {1, 2, 3, 4, 5};
        Integer b[] = {5, 4, 3, 2, 1};
        StackType stackType = new StackType();
//        stackType.getMin(a);
        System.out.println(stackType.judgeOrder(a, b));
    }

}

class MyStack<T> {
    //存储栈中的元素数组
    private Object[] objects;

    //记录栈的大小
    private int len = 0;

    //获取栈中的元素个数
    public int size() {
        return len;
    }

    //无参构造，自动设置数组大小
    public MyStack() {
        objects = new Object[10];
    }

    //通过构造函数自定义初始化数组大小
    public MyStack(int len) {
        objects = new Object[len];
    }

    //向栈中添加元素
    public void push(T item) {
        objects[len++] = item;
    }

    //获取栈中的第一个元素，不删除
    public T pep() {
        return (T) objects[len - 1];
    }

    //获取第一个元素，并“删除”
    public T pop() {
        T item = pep();
        len--;
        return item;
    }

    //遍历栈中的元素
    public void printObj() {
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + " ");
        }
        System.out.println();
    }
}