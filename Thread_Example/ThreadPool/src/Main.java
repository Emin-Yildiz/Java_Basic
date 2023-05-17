import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        ThreadEx ex = new ThreadEx();

        executor.execute(ex);
        executor.close();
    }
}