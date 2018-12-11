package thread.testThread.thread;

import java.util.Date;
import java.util.Hashtable;

/**
 * @author lk
 * 2018/8/7 18:08
 * @description:
 */
public class ThreadMap extends Thread {
    private Hashtable<Integer, StringBuffer> hashtable = new Hashtable<Integer, StringBuffer>();

    public void setHashtable() {
        for (int i = 0; i <= 5; i++) {
            StringBuffer stringBuffer = new StringBuffer("a" + i);
            hashtable.put(i, stringBuffer);
        }
    }

    @Override
    public void run() {
        setHashtable();
        for (Integer integer: hashtable.keySet()) {
            System.out.println("key == " + integer + "   " + "value == " + hashtable.get(integer));
//            try {
//                sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("时间：" + new Date().toLocaleString());
        }

    }
}
