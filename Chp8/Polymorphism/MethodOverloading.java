package Chp8.Polymorphism;

//For method overloading / Compiler time polymorphism we need 3 things
//     1. Methods should be in same class
//     2. Same method name 2 or more
//     3. Different argument : a. type of arg
//                             b. no of args
//                             c. sequence of args

public class MethodOverloading {

    void callMe(int a) {
        System.out.println("I am int");
    }
    void callMe(String a) {
        System.out.println("I am String");
    }

    public static void main(String[] args) {
        MethodOverloading one = new MethodOverloading();
        one.callMe(9);
    }

    // Can we do method overloading by changing the return type
    // No it cannot perform method overloading

    // Can we do method overloading of main method
    // Yes
}
