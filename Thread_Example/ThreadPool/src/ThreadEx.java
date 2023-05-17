public class ThreadEx implements Runnable{

    private static int a = 0;

    public ThreadEx(){}

    @Override
    public void run() {
        if(a < 200){
            for (int i = 0; i < 200; i++) {
                increnment();
                System.out.println(a);
            }
        }

    }

    public synchronized void increnment(){
        a++;
    }

}
