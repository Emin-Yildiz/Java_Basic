public class Main {

    public static void main(String[] args) {

        Developer back_dev = new Backend("Emin","a","Backend");
        Developer front_dev = new Frontend("Zeynep","b","Frontend");

        // Constuctor Injection
        Consumer backend_cons = new Consumer(back_dev);
        backend_cons.getConsumerInfo();
        backend_cons.developer.getInfo();

        System.out.println();
        // Setter Injection
        Consumer frontend_cons = new Consumer();
        frontend_cons.setDeveloper(front_dev);
        frontend_cons.getConsumerInfo();
        frontend_cons.developer.getInfo();

    }
}