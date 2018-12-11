package thread.topic;

/**
 * @author lk
 * 2018/10/20 8:49
 * @description:
 */
public abstract class TowThreadAddSub {

    static int j = 0;

    public abstract int math();

    public static void main(String[] args) {
        AddThread addMethod = new AddThread();
        SubThread subMethod = new SubThread();
        Threads addThreads = new Threads(addMethod);
        Threads subThreads = new Threads(subMethod);
        Thread addThread = new Thread(addThreads);
        Thread subThread = new Thread(subThreads);
        subThread.start();
        addThread.start();
    }
}

class Threads implements Runnable {

    private TowThreadAddSub thread;

    public Threads(TowThreadAddSub thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        int i = 0;
//        synchronized (Threads.class) {
            while (i <= 100) {
                thread.math();
                i++;
            }
//        }
    }
}

class AddThread extends TowThreadAddSub {
    @Override
    public int math() {
        System.out.println("addMethod j = " + j);
        j++;
        System.out.println("add j = " + j);
        return j;
    }
}

class SubThread extends TowThreadAddSub {
    @Override
    public int math() {
        System.out.println("subMethod j = " + j);
        j--;
        System.out.println("sub j = " + j);
        return j;
    }
}
