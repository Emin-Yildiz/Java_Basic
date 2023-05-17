public class Main{

    public static void main(String[] args) {
        System.out.println(deneme());
    }

    public static int deneme(){
        // catch bloğunda return ile karşılaşsa bile finall içinde girer.

        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
            return 1;
        } finally {
            System.out.println("Finally block is always executed");
            return 4;
        }
    }


}


