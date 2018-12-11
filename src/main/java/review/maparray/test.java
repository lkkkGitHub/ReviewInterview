package review.maparray;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * @author lk
 * 2018/8/17 10:27
 * @description:
 */
public class test {
    private Hashtable<Integer, String> map = new Hashtable<>();

    public void print() {

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        System.out.println(map.size());

        String s = "a";
        String a = "a";

        System.out.println(s == a);
        System.out.println(s.equals(a));

        for (Map.Entry<Integer, String> stringEntry: map.entrySet()) {
            System.out.println(stringEntry.getValue() + "   " + stringEntry.getKey());
        }
    }

    public static void main(String[] args) {
        test test = new test();
        test.print();
    }
}
