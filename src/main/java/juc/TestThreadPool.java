package juc;

import java.util.concurrent.*;

/**
 * @author lk
 * 2018/11/10 9:30
 */
public class TestThreadPool {
    public static void main(String[] args) {
        //阿里不推荐使用这种方式创建线程
        ExecutorService pool = Executors.newCachedThreadPool();

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();

        Future<Integer> f = pool.submit(new Callable<Integer>() {
            int i = 0;
            @Override
            public Integer call() throws Exception {
                for (int j = 0; j < 10; j++) {
                    i = i / 0;
                }
                return i;
            }
        });
        try {
            System.out.println(f.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            pool.shutdown();
        }
    }
}
