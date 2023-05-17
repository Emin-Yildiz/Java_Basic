public class Main implements Runnable{

    public static int a = 0 ;

    public static void main(String[] args){

        Thread th = new Thread(new Main());
        th.start();
        while (th.isAlive()){
            System.out.println("Thread is waiting");
        }
        System.out.println("A : " + a);
        a++;
        System.out.println("A : " + a);
    }

    @Override
    public void run() {
        a++;
    }
}
