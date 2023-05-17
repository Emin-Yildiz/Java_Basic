public class Backend extends Developer{

    public Backend(String name, String company, String field) {
        super(name, company, field);
    }

    @Override
    public void getInfo() {
        System.out.println("I am backend developer");
    }

}
