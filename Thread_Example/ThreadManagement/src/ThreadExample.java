public class ThreadExample implements Runnable{

    public static void main(String[] args){

        Thread th1 = new Thread(new ThreadExample());
        Thread th2 = new Thread(new ThreadExample());

        th1.setPriority(Thread.MIN_PRIORITY); // 1
        th2.setPriority(Thread.MAX_PRIORITY); // 10

        th1.start();
        th2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // Thread.currentThread() = o anda çalışan thread'in referansını alır.
            System.out.println(Thread.currentThread().getName());
        }
    }
}
