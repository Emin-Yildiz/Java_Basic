import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        arrayDisplay();
        System.out.println();
        stringDisplay();
    }

    public static void stringDisplay(){
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    private static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    public static void arrayDisplay(){
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            array.add(i);
        }

        // array.forEach( (n) -> {System.out.println(n);}) ;

        Consumer<Integer> method = (n) -> {System.out.println(n);};
        array.forEach(method);
    }
}



interface StringFunction{
    String run(String msg);
}