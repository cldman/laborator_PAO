package multiThread;

public class MultiThreadMain {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            Thread thread = new SimpleThread(i);
            System.out.println(Thread.currentThread().getName());
            thread.start();
            //thread.run() this will not be run in saparated thread
            Thread.currentThread().sleep(300);
            System.out.println("Invoking join");
            thread.join(); //waits for the thread to finish processing
            System.out.println();
            System.out.println((Thread.currentThread().getName() + " Returned from join: " + thread.isAlive()));
        }
    }
}
