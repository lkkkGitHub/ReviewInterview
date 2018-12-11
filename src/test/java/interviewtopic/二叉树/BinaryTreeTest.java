package interviewtopic.二叉树;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author lk
 * 2018/8/14 9:46
 * @description:
 */
public class BinaryTreeTest {

    BinaryTree binaryTree = new BinaryTree();
    int[] a = {1, 6, 8, 7, 6};
    int[] b = {1, 2, 4, 7, 3, 5, 6, 8};
    int[] c = {4, 7, 2, 1, 5, 3, 8, 6};
    //后序遍历
    int[] d = {1, 3, 2, 6, 5, 8, 7, 4};

    @Test
    public void setTree() {
        System.out.println(binaryTree.setTree(a, b));
    }

    @Test
    public void initTree() {
//        binaryTree.initTree(c, b);
        TreeLink treeLink = binaryTree.initTree2(c);
//        TreeLink link = binaryTree.mirror(treeLink);
//        binaryTree.printFirst(treeLink);
//        binaryTree.printMiddle(treeLink);
//        binaryTree.printBack(treeLink);
//        binaryTree.printCen(treeLink);
//        System.out.println(binaryTree.judegBack(d, c));
//        List<Integer> list = binaryTree.findNum(treeLink, 6);
//        Stream<List> stream = Stream.of(list);
//        stream.forEach(s -> System.out.println(s + " "));
        binaryTree.changTree(treeLink);
    }

}