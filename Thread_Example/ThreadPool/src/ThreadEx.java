public class ThreadEx implements Runnable{

    MathOperations mathOperations;
    private String procces;
    private int a,b;

    private int[] numbers;


    public ThreadEx(MathOperations math, String procces, int a, int b){
        this.mathOperations = math;
        this.procces = procces;
        this.a = a;
        this.b = b;;
    }

    public ThreadEx(MathOperations math, String procces, int []numbers){
        this.mathOperations = math;
        this.procces = procces;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        switch (procces){
            case "+":
                System.out.println(mathOperations.add(numbers));
                break;
            case "-":
                System.out.println(mathOperations.sub(numbers));
                break;
            case "*":
                System.out.println(mathOperations.multip(numbers));
                break;
            case "/":
                System.out.println(mathOperations.division(a,b));
                break;
            case "^^":
                System.out.println(mathOperations.involution(a,b));
                break;
            case "%":
                System.out.println(mathOperations.square(a,b));
                break;
            default:
                System.out.println("transaction does not match");
        }

    }



}
