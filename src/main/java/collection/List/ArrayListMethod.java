package collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lk
 * 2018/10/24 8:06
 * @description:
 */
public class ArrayListMethod {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list.size()  " + list.size());
        System.out.println("list.contains(2)   " + list.contains(2));
        System.out.println("list.isEmpty()   " + list.isEmpty());
        System.out.println("list.indexOf(1)   " + list.indexOf(1));
        System.out.println("list.lastIndexOf(1)   " + list.lastIndexOf(3));
//        Integer[] a = (Integer[]) list.toArray();  //出现类型转换异常，不能转换
//        System.out.println("list.toArray() return Object[]");
//        System.out.println(a.toString());
        Integer[] b = new Integer[list.size()];
        list.toArray(b);
        System.out.println("list.toArray(T []) return T[]");
        System.out.println(b.toString());
        System.out.println("Integer[] integers = (Integer[]) list.toArray(new Integer[0])");
        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(integers.toString());
        list.add(3, 5);
        System.out.println("list.add(3 ,5)  第三位，添加5 " + list.toString());
        list.add(2, 4); //并不会覆盖list中的元素
        System.out.println("list.add(2, 4) " + list.toString());
        System.out.println("list.remove(2)  " + list.remove(2)); //删除指定位置元素
        System.out.println(list.toString());
        System.out.println("list.remove(2)   " + list.remove(new Integer(2))); //删除指定内容的元素
        System.out.println(list.toString());
        List<Integer> list1 = (List<Integer>) ((ArrayList<Integer>) list).clone();
        System.out.println("(List<Integer>) (ArrayList<Integer>) list.clone()  " + list1.toString());
        list.addAll(list1); //不指定index即在后追加
        System.out.println("list.addAll(list1)   " + list.toString());
        list.addAll(0, list1); //从指定位置开始赋值，其余元素后移
        System.out.println("list.addAll(index, collection)  " + list.toString());
        list.removeAll(list); //传入一个集合，表示删除与该集合中相同的元素
        System.out.println("list.removeAll(list1)  list" + list.toString());
        list1.clear(); // 删除所有元素
        System.out.println("list1.toString()   " + list1.toString());
    }

}
