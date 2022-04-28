package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateThreadMain2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println(Thread.currentThread().getName());
        service.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            for (int i=0; i<10; i++) {
                System.out.println(i);
            }
        });
    }
}
