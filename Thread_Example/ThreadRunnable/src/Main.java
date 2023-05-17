public class Main implements Runnable{

    public static void main(String[] args){

        Thread thread = new Thread(new Main());
        thread.start();
        System.out.println("Hi thread");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5*1000);
            System.out.println("uzun işlem sonucu");
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }



}
