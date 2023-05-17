public enum Size2 {
    SMALL, MEDIUM,LARGE;

    public String getSize(){
        switch (this){
            case LARGE -> {
                return "large";
            }
            case SMALL -> {
                return "small";
            }
            case MEDIUM -> {
                return "medium";
            }
            default -> {
                return "null";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Size2.LARGE.getSize());
    }
}
