public class Main implements Runnable{
    static int a = 0;
    public static void main(String[] args) {

        Thread th1 = new Thread(new Main());
        Thread th2 = new Thread(new Main());

        th1.start();
        th2.start();

    }

    @Override
    public void run() {

        // synchronized blok kullanımı
        synchronized (Main.class){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
        for (int i = 0; i < 50; i++) {
            increnment();
            System.out.println("Thread name: " + Thread.currentThread().getName() +", a value: " + a);
        }

    }

    // sadece 1 thread bu metodu kullanıp a değerini değiştirebilir. (synchronized metod kullanımı)
    public synchronized void increnment(){
        a++;
    }
}