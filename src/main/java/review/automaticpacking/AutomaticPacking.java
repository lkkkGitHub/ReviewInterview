package review.automaticpacking;

import java.util.*;

/**
 * @author review.automaticpacking
 * 2018/8/3 18:59
 * @description:
 */
public class AutomaticPacking {
    public void auto() {
        Integer i = 1;
        int k = i;
        int t = 1;
        List<Integer> list = new ArrayList<Integer>();
        list.add(t);
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 2);
        map.put("b", 3);
        map.put("a", 4);
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "a");
        map1.put(2, "b");
        for (Object obj : map.keySet()) {
            System.out.println(map.get(obj));
        }

        for (Object obj: map1.keySet()) {
            System.out.println(map1.get(obj));
        }

        System.out.println(map.get("a"));
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(2));

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
        System.out.println("---------");

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void shuzu() {
        int A[] = {1, 2, 3};
        for (int a: A) {
            a = 1;
            System.out.println(a);
        }
    }

    public void Sets() {
        Set<String> set = new HashSet<String>();
        String a = "a";
        String b = "b";
        String c = "b";
        String d = new String("d");
        String e = new String("d");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(e.hashCode());
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(e);
        for (String s: set) {
            System.out.println(s + "==" + s.hashCode());
        }

        System.out.println("-----------");

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            //异常 java.util.ConcurrentModificationException，原因是再使用迭代器进行遍历集合时，对集合进行了增减等操作
            //list.add(1);
            System.out.println(iterator.next());
        }
    }

    public void Interger() {
        Integer i = 1;
        Integer k = 1;
        System.out.println(i == k);
        System.out.println(i.hashCode() + "  " + k.hashCode());
        Integer j = new Integer(2);
        Integer l = new Integer(2);
        System.out.println(j == l);
        System.out.println(j.hashCode() + "  " + l.hashCode());
    }
}
