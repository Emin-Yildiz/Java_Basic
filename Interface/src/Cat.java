public class Cat implements Animal{

    String name;
    String voice;
    String info;

    public Cat(String name, String voice, String info){
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
