package multiThread;

public class SimpleThread extends Thread{
    private int threadNumber;


    SimpleThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Thread with number "+ threadNumber + " says " + i);
        }
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
