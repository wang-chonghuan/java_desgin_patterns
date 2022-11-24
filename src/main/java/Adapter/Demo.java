package Adapter;

import java.util.concurrent.Callable;

public class Demo {
    public static void run() throws InterruptedException {
        Callable<Long> callable = new Task(3);
        RunnableAdapter runnableAdapter = new RunnableAdapter(callable);
        Thread thread = new Thread(runnableAdapter); // Thread不接受Callable初始化，只接受Runnable
        thread.run();
        thread.join();
    }
}
