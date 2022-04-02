package src;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("ggggg");
//        System.out.println("fff");
        String s ="d";
        if(s.length()>=1)
            s="g";
        switch (s){
            case "d1":
                System.out.println("d1 option");
            case "g":
                System.out.println("g option");
            default:
                System.out.println("default option");
        }

    }
}


