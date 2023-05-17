import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        MathOperations math = new MathOperations();

        ThreadEx th1 = new ThreadEx(math,"+", new int[]{121, 3123, 432, 123, 41, 2231, 4123});
        ThreadEx th2 = new ThreadEx(math,"-", new int[]{999999,42,4,243,5,432,2341,2343,1});
        ThreadEx th3 = new ThreadEx(math,"+", new int[]{124,124,14,14,5,1,51,24,5,12,34,541,234,512,3,4});
        ThreadEx th4 = new ThreadEx(math,"/", 234,42);
        ThreadEx th5 = new ThreadEx(math,"^^", 24,424);
        ThreadEx th6 = new ThreadEx(math,"%", 234,42);

        ExecutorService executor = Executors.newFixedThreadPool(6);

        Thread thread1=new Thread(th1);
        Thread thread2=new Thread(th2);
        Thread thread3=new Thread(th3);
        Thread thread4=new Thread(th4);
        Thread thread5=new Thread(th5);
        Thread thread6=new Thread(th6);

        executor.submit(thread1);
        executor.submit(thread2);
        executor.submit(thread3);
        executor.submit(thread4);
        executor.submit(thread5);
        executor.submit(thread6);

        executor.shutdown();
    }
}