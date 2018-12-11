package thread.testThread.thread;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lk
 * 2018/8/7 18:18
 * @description:
 */
public class ThreadSet extends Thread {
    private Set<String> hashSet = new HashSet<String>();


    public void setHashSet() {
        for (int i = 0; i <= 5; i++) {
            hashSet.add(i + "");
        }
    }
    @Override
    public void start() {
        setHashSet();
        for (String stringBuffer: hashSet) {
            System.out.println("hashSet == " + stringBuffer);
        }
        System.out.println("==============");
//        for (int i = 0; i <= 5; i++) {
//            if (i == 2) {
//                yield();
//            }
//        }
    }
}
