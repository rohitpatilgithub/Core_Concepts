package Chp8.Polymorphism;

public class MainMethodOverloading {

    // Example of how can we do main method overloading

    public static void main(String[] a) {
        System.out.println("I am String");
        MainMethodOverloading one = new MainMethodOverloading();
        one.main(1);    // here we get expected results cuz compiler gets what it want in particular way and flow
    }

    public static void main(int a) {
        System.out.println("I am int");
//        MainMethodOverloading one = new MainMethodOverloading();
//        one.main(1);
        // here we expect to retrieve this method but that's not fair case for compiler that's why it does not compile
    }
    
}
