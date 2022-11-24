package Adapter;

import java.util.concurrent.Callable;

public class RunnableAdapter implements Runnable {

    private final Callable<?> callable;

    public RunnableAdapter(Callable<?> callable) {
        this.callable = callable;
    }

    @Override
    public void run() {
        try {
            // 将对Runnable.run的调用，委托给Callable.call接口，其实是包装了Callable
            callable.call();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

/**
 * 适配器模式在Java标准库中有广泛应用。比如我们持有数据类型是String[]，但是需要List接口时，可以用一个Adapter：
 *
 * String[] exist = new String[] {"Good", "morning", "Bob", "and", "Alice"};
 * Set<String> set = new HashSet<>(Arrays.asList(exist));
 *
 * List<T> Arrays.asList(T[])就相当于一个转换器，它可以把数组转换为List
 */
