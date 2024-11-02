package Chp8.StaticKeyword;

class Cigar {
    Cigar(){
        System.out.println("Cigar constructor");
    }
    class Weed {
        static {
            System.out.println("Weed static block");
        }
    }
}

//class Wow{
//    static int x;
//    static class Doo{
//        Doo(){
//            System.out.println("Constructor from static class");
//        }
//        static{
//            System.out.println("static block method from static class");
//        }
//    }
//}

public class StaticNested {
    public static void main(String[] args) {
//        Cigar ox = new Cigar();
//        Cigar.Weed one = ox.new Weed();
        // here check the flow and
//        Wow one = new Wow();
//        Wow.Doo two = new Wow.Doo();
        System.out.println("In main");
    }
}
