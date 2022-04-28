package multiThread;

public class CreateThreadMain {
    public static void main(String[] args) {
        //create Thread method 2
        new Thread(() -> { //implementare a Runnable
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }).start();
    }
}
