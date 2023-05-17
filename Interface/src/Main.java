public class Main {
    public static void main(String[] args) {

        Cat cat =  new Cat("Paşa", "Miyav", "Tekir");

        System.out.println(cat.run());
        System.out.println(cat.sleep());
        cat.getIAnimalInfo();

        System.out.println();
        
        Dog dog = new Dog("Osman", "Hav Hav", "Karabaş");
        System.out.println(dog.sleep());
        System.out.println(dog.run());
        dog.getIAnimalInfo();
    }
}