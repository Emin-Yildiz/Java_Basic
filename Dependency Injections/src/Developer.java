public abstract class Developer {

    private String name;
    private String company;
    private String field; // alanı

    public Developer(String name, String company, String field){
        this.company = company;
        this.field = field;
        this.name = name;
    }

    public abstract void getInfo();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
