package Test;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author lk
 * 2018/8/27 10:44
 * @description:
 */
public class MapTest {
    private static Map<String, Integer> map = new HashMap<>();

    public static void initMap() {
        map.put("a", 1);
        map.put("", 2);
        map.put("", 3);
        map.put(null, 4);
        map.put(null, 5);
        map.put("b", null);
        map.put("c", null);
        map.put("d", null);
        for (Map.Entry<String, Integer> mapEntry: map.entrySet()) {
            System.out.println(mapEntry.getKey() + "  " + mapEntry.getValue());
        }
    }

    public static void main(String[] args) {
        initMap();
    }
}
