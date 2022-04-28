package concurrency;

import java.util.List;

public class ConsumerTask extends BufferQueue implements Runnable {

    public ConsumerTask(List<Integer> queue) {
        super(queue);
    }

    @Override
    public void run() {
        while(true) {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException{
        //lock queue
        synchronized (queue) {
            while(queue.isEmpty()) {
                System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting, queue size is: " + queue.size());
                queue.wait();
            }
            Thread.sleep(1000);
            int i =  queue.remove(0);
            System.out.println("Consumed: " + i);
            queue.notifyAll();
        }
    }
}
