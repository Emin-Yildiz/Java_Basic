public class Frontend extends Developer{

    public Frontend(String name, String company, String field) {
        super(name, company, field);
    }

    @Override
    public void getInfo() {
        System.out.println("I am frontend developer");
    }

}
