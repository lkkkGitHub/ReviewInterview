package interviewtopic.二叉树;

import java.util.*;

/**
 * @author lk
 * 2018/8/14 9:24
 * @description:
 */
public class BinaryTree {
    /**
     * 判断二叉树的两种遍历结果是否含有重复元素
     *
     * @param a 数组可变参数列表
     * @return 有重复即返回ture，没有即返回false
     */
    public boolean setTree(int[]... a) {
        boolean check = false;
        int i = 0;
        int len = 0;
        while (len < a.length && !check) {
            while (i < a[len].length - 1 && !check) {
                int j = i + 1;
                while (j < a[len].length && !check) {
                    if (a[len][i] == a[len][j]) {
                        check = true;
                        System.out.println(len + " " + i + " " + j);
                    }
                    j++;
                }
                i++;
            }
            len++;
        }
        return check;
    }

    /**
     * 重新构建二叉树
     *
     * @param treeLink 二叉树的根节点
     * @param a        重构传入的参数
     */
    public void rebuildTree(TreeLink treeLink, int a) {
        if (treeLink.getValue() > a) {
            if (treeLink.getLeftTree() == null) {
                TreeLink treeLink1 = new TreeLink(a);
                treeLink.setLeftTree(treeLink1);
            } else {
                rebuildTree(treeLink.getLeftTree(), a);
            }
        } else {
            if (treeLink.getRightTree() == null) {
                TreeLink treeLink1 = new TreeLink(a);
                treeLink.setRightTree(treeLink1);
            } else {
                rebuildTree(treeLink.getRightTree(), a);
            }
        }
    }

    /**
     * 判断一个数列是否是一个二叉树得后序遍历
     *
     * @param a
     * @param b
     * @return
     */
    public boolean judegBack(int[] a, int[] b) {
        boolean check = true;
        int i = 0;
        while (i < a.length && check) {
            if (a[i] != b[i]) {
                check = false;
            }
            i++;
        }
        return check;
    }

    /**
     * 层序遍历二叉树
     *
     * @param treeLink 根节点
     */
    public void printCen(TreeLink treeLink) {
        Queue<TreeLink> queue = new LinkedList<>();
        queue.add(treeLink);
        while (queue.size() != 0) {
            if (queue.peek().getLeftTree() != null) {
                queue.add(queue.peek().getLeftTree());
            }
            if (queue.peek().getRightTree() != null) {
                queue.add(queue.peek().getRightTree());
            }
            System.out.print(queue.poll().getValue() + " ");
        }
        System.out.println();
    }


    /**
     * 前序遍历二叉树
     *
     * @param treeLink 二叉树根节点
     */
    public void printFirst(TreeLink treeLink) {
        if (treeLink != null) {
            System.out.print(treeLink.getValue() + " ");
            printFirst(treeLink.getLeftTree());
            printFirst(treeLink.getRightTree());
        }
    }

    /**
     * 中序遍历二叉树
     *
     * @param treeLink 二叉树根节点
     */
    public void printMiddle(TreeLink treeLink) {
        if (treeLink != null) {
            printMiddle(treeLink.getLeftTree());
            System.out.print(treeLink.getValue() + " ");
            printMiddle(treeLink.getRightTree());
        }
    }

    /**
     * 后序遍历二叉树
     *
     * @param treeLink 二叉树根节点
     */
    public void printBack(TreeLink treeLink) {
        if (treeLink != null) {
            printBack(treeLink.getLeftTree());
            printBack(treeLink.getRightTree());
            System.out.print(treeLink.getValue() + " ");
        }
    }

    /**
     * 判断输入的遍历值，是否含有重复的值，没有即重构二叉树，不做处理
     * 遍历重构后的二叉树
     *
     * @param a 前序，中序遍历的二叉树数组，可变参数
     */
    public void initTree(int[]... a) {
        if (a.length == 2) {
            if (a.length == 0 || a[0].length == 0 || a[1].length == 0) {
                System.out.println("请重新输入数据");
                return;
            }
            if (!setTree(a[0], a[1])) {
                TreeLink treeLink = new TreeLink(a[0][0]);
                int i = 1;
                while (i < a[0].length) {
                    rebuildTree(treeLink, a[0][i]);
                    i++;
                }
//                System.out.println("前序遍历");
//                printFirst(treeLink);//前序遍历   根，左，右
//                System.out.println();
//                System.out.println("中序遍历");
//                printMiddle(treeLink);//中序遍历  左，根，右
//                System.out.println();
//                System.out.println("后序遍历");
//                printBack(treeLink);
                System.out.println("层序遍历");
                printCen(treeLink);
            }
        }
    }

    public TreeLink initTree2(int[] a) {
        if (a.length == 0) {
            System.out.println("请重新输入数据");
            return null;
        }
        TreeLink treeLink = new TreeLink(a[0]);
        int i = 1;
        while (i < a.length) {
            rebuildTree(treeLink, a[i]);
            i++;
        }
        return treeLink;
    }

    //判断子树
    public void print(TreeLink treeLink, TreeLink treeLink1) {
        if (treeLink != null && treeLink1 != null) {
            if (treeLink1.getValue() == treeLink.getValue()) {
                print(treeLink.getLeftTree(), treeLink1.getLeftTree());
                print(treeLink.getRightTree(), treeLink1.getRightTree());
            } else {
                print(treeLink.getLeftTree(), treeLink1);
                print(treeLink.getRightTree(), treeLink1);
            }
        }
    }

    //镜像树
    public TreeLink mirror(TreeLink link) {
        TreeLink temp = null;
        if (link != null) {
            if (link.getLeftTree() != null || link.getRightTree() != null) {
                temp = link.getLeftTree();
                link.setLeftTree(link.getRightTree());
                link.setRightTree(temp);
                mirror(link.getLeftTree());
                mirror(link.getRightTree());
            }
        }
        return link;
    }

    Integer[] aA = new Integer[10];
    Integer[] aB = new Integer[10];
    int iA = 0;
    int iB = 0;
    /**
     * 遍历二叉树所有节点，以及某个数在二叉树中的路径
     *
     * @param treeLink
     * @param num
     * @return
     */
    public List<Integer> findNum(TreeLink treeLink, int num) {
        printFirstA(treeLink); //aA
        printBackA(treeLink); //aB
        int aNum = 0;
        List<Integer> list = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < aA.length - 2; i++) {
            stack.push(aA[i]);
        }
        while (aNum < aB.length - 1) {
            if (aB[aNum] == num) {
                break;
            } else {
                aNum++;
            }
        }
        for (int i = 0; i < aA.length - 2; i++) {
            if (stack.peek() == num) {
                list.add(stack.pop());
                for (int j = i + 1; j < aB.length - 2; j++) {
                    boolean check = false;
                    int aNum2 = aNum + 1;
                    while (aNum2 < aB.length - 2 && !check) {
                        if (stack.peek() == aB[aNum2]) {
                            check = true;
                        } else {
                            aNum2++;
                        }
                    }
                    if (check) {
                        list.add(stack.pop());
                    } else {
                        stack.pop();
                    }
                }
                break;
            } else {
                stack.pop();
            }
        }
        return list;
    }

    /**
     * 获取前序遍历
     * @param treeLink
     */
    private void printFirstA(TreeLink treeLink) {
        if (treeLink != null) {
            aA[iA++] = treeLink.getValue();
            printFirstA(treeLink.getLeftTree());
            printFirstA(treeLink.getRightTree());
        }
    }

    /**
     * 获取后序遍历
     * @param treeLink
     */
    public void printBackA(TreeLink treeLink) {
        if (treeLink != null) {
            printBackA(treeLink.getLeftTree());
            printBackA(treeLink.getRightTree());
            aB[iB++] = treeLink.getValue();
        }
    }

    /**
     * 将二叉树变成双向链表
     *
     * @param treeLink
     */
    public TreeLink changTree(TreeLink treeLink) {
        printMiddleAS(treeLink);
        int index = 0;
        while (index < list.size()) {
            if (index == 0) {
                list.get(index).setRightTree(list.get(index + 1));
            } else if (index == 7) {
                list.get(index).setLeftTree(list.get(index - 1));
            } else {
                list.get(index).setRightTree(list.get(index + 1));
                list.get(index).setLeftTree(list.get(index - 1));
            }
            index++;
        }
        return list.get(0);
    }
    List<TreeLink> list = new ArrayList<>();
    private void printMiddleAS(TreeLink treeLink) {
        if (treeLink != null) {
            printMiddleAS(treeLink.getLeftTree());
            list.add(treeLink);
            printMiddleAS(treeLink.getRightTree());
        }
    }
}


/**
 * 二叉树数据结构
 */
class TreeLink {
    private int value;
    private TreeLink leftTree = null;
    private TreeLink rightTree = null;

    public int getValue() {
        return value;
    }

    public TreeLink(int value) {
        this.value = value;
    }

    public TreeLink getLeftTree() {
        return leftTree;
    }

    public TreeLink getRightTree() {
        return rightTree;
    }

    public void setLeftTree(TreeLink leftTree) {
        this.leftTree = leftTree;
    }

    public void setRightTree(TreeLink rightTree) {
        this.rightTree = rightTree;
    }
}