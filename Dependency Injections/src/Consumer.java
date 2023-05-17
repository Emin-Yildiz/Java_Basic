public class Consumer {

    Developer developer;

    // Constuctor Injection
    public Consumer(Developer developer){
        this.developer = developer;
    }

    public Consumer(){

    }

    // Setter Injection
    public void setDeveloper(Developer frontDev) {
        this.developer = frontDev;
    }

    public void getConsumerInfo(){
        System.out.println(
                "Working with " + developer.getName() +
                        "\nDeveloper field is " + developer.getField()
        );
    }
}
