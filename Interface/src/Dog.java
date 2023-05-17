public class Dog implements Animal{

    String name;
    String voice;
    String info;

    public Dog(String name, String voice, String info){
        this.name = name;
        this.voice = voice;
        this.info = info;
    }

    @Override
    public String run() {
        return name + " is running";
    }

    @Override
    public String sleep() {
        return name + " is sleeping";
    }

}
