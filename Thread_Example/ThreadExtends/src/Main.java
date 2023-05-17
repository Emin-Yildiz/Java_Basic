public class Main extends Thread{

    public static void main(String[] args) {

        Main thread = new Main();
        thread.start(); // threadi başlattık.
        System.out.println("Hi Thread");

    }

    @Override
    public void run(){
        try {
            Thread.sleep(5*1000);
            System.out.println("uzun işlem sonucu");
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }
}