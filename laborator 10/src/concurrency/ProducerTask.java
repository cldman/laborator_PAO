package concurrency;

import java.util.List;

public class ProducerTask extends BufferQueue implements Runnable{
    private final int maxCapacity;

    public ProducerTask(List<Integer> queue, int maxCapacity) {
        super(queue);
        this.maxCapacity = maxCapacity;
    }


    @Override
    public void run() {
            int counter = 0;

            while (true) {
                try{
                    produce(counter++);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
    }


    private void produce(int input) throws InterruptedException{
        synchronized (queue) {
            while (queue.size() == maxCapacity) {
                System.out.println("Queue is full " + Thread.currentThread().getName()
                        + " is waiting, size: " + queue.size());
                queue.wait();
            }
            Thread.sleep(1000);
            queue.add(input);
            System.out.println("Produced: " + input);
            queue.notifyAll();
        }
    }
}
