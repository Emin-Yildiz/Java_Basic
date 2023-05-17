public class MathOperations implements Operations{
    @Override
    public int add(int... numbers) {
        int a = 0;
        for(int number:numbers){
            a += number;
        }
        return a;
    }

    @Override
    public int sub(int... numbers) {
        int a = 0;
        for(int number:numbers){
            a -= number;
        }
        return a;
    }

    @Override
    public long multip(int... numbers) {
        long a = 0;
        for(int number:numbers){
            a *= number;
        }
        return a;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

    @Override
    public int square(int a, int b) {
        return (int) Math.pow(a, 1/b);
    }

    @Override
    public int involution(int a, int b) {
        return (int) Math.pow(a,b);
    }
}
