package concurrency;

import java.util.ArrayList;
import java.util.List;

public class ProduceConsumeMain {

    public static void main(String[] args) {
        List<Integer> queue = new ArrayList<>();
        int capacitiy = 5;
        Thread producer = new Thread(new ProducerTask(queue, capacitiy), "Producer");
        Thread consumer = new Thread(new ConsumerTask(queue), "Consumer");

        producer.start();
        consumer.start();
    }
}
