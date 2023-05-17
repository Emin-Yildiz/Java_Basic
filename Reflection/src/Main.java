import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

class Dog extends Animal {

    public String name;
    public int age;

    public Dog(){}

    private Dog(String name){this.name = name;}
    public void display() {
        System.out.println("I am a dog.");
    }

    public void makeSound(){
        System.out.println("hav hav");
    }
}

class Main {
    public static void main(String[] args) {
        try {
            Dog d1 = new Dog();

            Class obj = d1.getClass();

            String name = obj.getName();
            System.out.println("Name: " + name);

            int modifier = obj.getModifiers();

            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());

            Method[] methods = obj.getDeclaredMethods();
            
            reflectionMethods(methods);

            Constructor[] constructors = obj.getDeclaredConstructors();

            reflectionConstructor(constructors);
            
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void reflectionConstructor(Constructor[] constructors){
        for (Constructor c : constructors) {

            System.out.println("Constructor Name: " + c.getName());

            int modifier = c.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            System.out.println("Parameters: " + c.getParameterCount());
            System.out.println("");
        }

    }
    private static void reflectionMethods(Method[] methods) {
        for (Method m : methods) {
            System.out.println();
            System.out.println("Method Name: " + m.getName());

            int modifier = m.getModifiers();
            System.out.println("Modifier: " + Modifier.toString(modifier));

            System.out.println("Return Types: " + m.getReturnType());
            System.out.println(" ");
        }
    }
}