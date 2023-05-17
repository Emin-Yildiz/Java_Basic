public interface Animal {

    public String run();
    public String sleep();

    public default void getIAnimalInfo(){
        System.out.println("hayvanlar güzeldir");
    }

}
