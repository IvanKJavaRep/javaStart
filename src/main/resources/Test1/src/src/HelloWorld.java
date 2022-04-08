package src;



public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("ggggg");
//        System.out.println("fff");
        System.out.println("hhhhhhhhh");
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
        String[] arr = new String[5];
        System.out.printf("%s%s%n",s,s);
        int x =10;
        do
        {
            System.out.println(x);
            x--;
        } while(x>=0);
        int[] lst = new int[] {1,2,3,4};

        for (int i:lst)
        {
            System.out.println("x");
        }
        Dog.Status();
        S(sdd);
    }
    public static void Method()
    {
        double s =3;
    }

    public static class Test {
        public static void HMeth()
        {

        }
    }
    static String sdd = "ffff gggg hhhh";
    public static String[] S(String s)
    {
        for (String a:s.split(" ")
             ) {
            System.out.println(a);
        }
        System.out.println("gggggggggg");
        return s.split(" ");
    }

}
class G
{
    HelloWorld.Test d = new HelloWorld.Test();
    public static void Getf()
    {

    }
}



