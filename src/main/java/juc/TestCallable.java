package juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author lk
 * 2018/11/8 22:19
 * @description:
 */
public class TestCallable {

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        FutureTask<Integer> future = new FutureTask(testThread);
        try {
            new Thread(future).start();
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class TestThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 200; i++) {
            sum += i;
        }
        return sum;
    }
}
