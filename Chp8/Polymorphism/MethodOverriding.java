package Chp8.Polymorphism;

//For method overriding we need 3 things
//     1. Methods should be in different class
//     2. Same method name 2 or more
//     3. Same argument :      a. type of arg
//                             b. no of args
//                             c. sequence of args
//     4. Inheritance ( IS-A relationship )

class Alloy {
    void callMe() {
        System.out.println("I am Alloy");
    }
}

public class MethodOverriding extends Alloy {
    void callMe() {
        System.out.println("I am Pure");
    }
    public static void main(String[] args) {
        Alloy one = new Alloy();
        one.callMe();

        MethodOverriding two = new MethodOverriding();
        two.callMe();
    }
}
