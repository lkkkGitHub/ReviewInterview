package interviewtopic.linkedlist;

/**
 * @author lk
 * 2018/8/16 9:36
 * @description:
 */
public class LinkedList {

    static Integer[] a = {1, 2, 3, 6, 11};
    static Integer[] b = {2, 5, 8, 10};

    protected static final List headList = new List(a[0]);
    protected static final List headLista = new List(b[0]);

    public void initList(Integer[] a) {
        int i = 1;
        while (i < a.length) {
            setLinkedList(headList, a[i]);
            i++;
        }
        int j = 1;
        while (j < b.length) {
            setLinkedList(headLista, b[j]);
            j++;
        }
//        printList(headList);
//        System.out.println();
//        System.out.println("链表大小：" + List.getListSize());
//        System.out.println("第2个节点是：" + headList.getIndex(2).getValue());
//        System.out.println("倒数第6个节点是：" + headList.getLastIndex(6).getValue());
//        convertList(LinkedList.headList);
        twoListSort(headList, headLista);
    }

    private void setLinkedList(List list, int a) {
        if (list.getNextList() == null) {
            List nextList = new List(a);
            list.setNextList(nextList);
        } else {
            setLinkedList(list.getNextList(), a);
        }
    }

    private void printList(List list) {
        System.out.print(list.getValue() + " ");
        if (list.getNextList() != null) {
            printList(list.getNextList());
        }
    }

    public List getHeadList() {
        return headList;
    }

    List next = null;
    List node = null;

    public void convertList(List list) {
        if (list.getNextList() != null) {
            next = list.getNextList();
            list.setNextList(node);
            node = list;
            convertList(next);
        } else {
            list.setNextList(node);
            printList(list);
        }
    }

    public void twoListSort(List aList, List bList) {
        List list = null;
        while (aList != null || bList != null) {
            if (aList != null && bList != null) {
                if (aList.getValue() >= bList.getValue()) {
                    if (list == null) {
                        list = bList;
                    } else {
                        list.setNextList(bList);
                        list = list.getNextList();
                    }
                    bList = bList.getNextList();
                } else if (aList.getValue() < bList.getValue()) {
                    if (list == null) {
                        list = aList;
                    } else {
                        list.setNextList(aList);
                        list = list.getNextList();
                    }
                    aList = aList.getNextList();
                }
            } else if (aList == null && bList != null) {
                if (list == null) {
                    list = bList;
                } else {
                    list.setNextList(bList);
                }
                break;
            } else if (aList != null && bList == null) {
                if (list == null) {
                    list = aList;
                } else {
                    list.setNextList(aList);
                }
                break;
            } else {
                break;
            }
            System.out.print(list.getValue() + " ");
        }
        printList(list);
    }
}

class List extends LinkedList {
    private int value;
    private List nextList = null;
    private static int listSize = 1;

    /**
     * 构造函数初始化链表的值
     *
     * @param value int类型的链表值
     */
    List(int value) {
        this.value = value;
    }

    public List() {
    }

    /**
     * 获取链表节点的值
     *
     * @return
     */
    int getValue() {
        return value;
    }

    /**
     * 获取下一个节点
     *
     * @return
     */
    List getNextList() {
        return nextList;
    }

    /**
     * 初始化下一个节点，并记录下链表的大小
     *
     * @param nextList
     */
    void setNextList(List nextList) {
        this.nextList = nextList;
        listSize++;
    }

    /**
     * 获取链表的大小
     *
     * @return
     */
    static int getListSize() {
        return listSize;
    }

    /**
     * 判断输入的值，是否在链表的范围内
     *
     * @param index
     * @return
     */
    private boolean isElementIndex(int index) {
        return index > 0 && index <= listSize;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + listSize;
    }

    /**
     * 获取指定的节点值
     *
     * @param index
     * @return
     */
    public List getIndex(int index) {
        List head = headList;
        boolean check = false;
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        } else {
            int i = 0;
            while (i < listSize && !check) {
                if (index - 1 == i) {
                    check = true;
                } else {
                    i++;
                    head = head.getNextList();
                }
            }
        }
        return head;
    }

    public List getLastIndex(int index) {
        return getIndex(listSize - index + 1);
    }

}