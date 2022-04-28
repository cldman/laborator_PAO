package concurrency;

import java.util.List;

public class BufferQueue {
    protected final List<Integer> queue;

    public BufferQueue(List<Integer> queue) {
        this.queue = queue;
    }
}
