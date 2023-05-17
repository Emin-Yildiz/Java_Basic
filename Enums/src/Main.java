enum Size{
    SMALL("size is small"){
        public String toString(){
            return "size is small";
        }
    },
    MEDIUM("size is medium"){
        public String toString(){
            return "size is medium";
        }
    },
    LARGE("size is large"){
        public String toString(){
            return "size is large";
        }
    },
    EXTRALARGE("size is extralarge"){
        public String toString(){
            return "size is extralarge";
        }
    };

    private final String size;
    Size(String s) {
        this.size = s;
    }

    public String getSize(){
        return size;
    }
}

class Test{
    Size body;

    public Test(Size size){
        this.body = size;
    }

    public void orderBody(){
        switch (body){
            case SMALL -> System.out.println("Body is: " + body);
            case MEDIUM -> System.out.println("Body is: " + body);
            case LARGE -> System.out.println("Body is: " + body);
            case EXTRALARGE -> System.out.println("Body is: " + body);
            default -> System.out.println("Body is not equals");
        }
        System.out.println(body.ordinal());
    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test(Size.LARGE);
        Size size = Size.MEDIUM;
        System.out.println(size.getSize()); // constructor ile oluşturulan nesne hangi nitelik ile oluşturuldu ise o niteliğin parametresini ekrana yazdırdı
        test.orderBody();
        System.out.println(Size.MEDIUM.toString());
    }
}