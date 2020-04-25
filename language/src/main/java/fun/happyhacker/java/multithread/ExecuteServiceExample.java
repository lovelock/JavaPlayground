package fun.happyhacker.java.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuteServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnableTasks = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread name " + Thread.currentThread().getId());
        };

        long currentTime = System.currentTimeMillis();
        System.out.println("start");
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);
        executorService.submit(runnableTasks);

        System.out.println("costs: " + (System.currentTimeMillis() - currentTime));
    }
}
