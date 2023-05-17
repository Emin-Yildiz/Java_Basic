public class Main {
    public static void main(String[] args) {

        MyThread th1 = new MyThread("Thread-1");
        MyThread th2 = new MyThread("Thread-2");
        MyThread th3 = new MyThread("Thread-3");

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        }catch (InterruptedException e){
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Child threads join main thread\n Main thread is terminated");
    }
}