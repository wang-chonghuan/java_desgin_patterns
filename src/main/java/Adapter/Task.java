package Adapter;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

@Slf4j
public class Task implements Callable<Long> {

    private final long num;

    Task(long num) {
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        long r = 0;
        for(long n = 1; n <= num; n++) {
            r += n;
        }
        log.info("task result: {}", r);
        return r;
    }
}
/**
 * 现在，我们想通过一个线程去执行它：
 *
 * Callable<Long> callable = new Task(123450000L);
 * Thread thread = new Thread(callable); // compile error!
 * thread.start();
 * 发现编译不过！因为Thread接收Runnable接口，但不接收Callable接口，肿么办？
 *
 * 一个办法是改写Task类，把实现的Callable改为Runnable，但这样做不好，
 * 因为Task很可能在其他地方作为Callable被引用，改写Task的接口，会导致其他正常工作的代码无法编译。
 *
 * 另一个办法不用改写Task类，而是用一个Adapter，把这个Callable接口“变成”Runnable接口，这样，就可以正常编译：
 */
