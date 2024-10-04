package Chp8.Abstractions;

// interface {
//      methods ( public abstract )

//      After 8 version

//      default concrete method ( if we want ) {
//              body must be included
//      }

//      static method ( if we don't want ) {
//      Also public keyword must be added otherwise compiler automatically makes public
//              body must be included
//      }

//      After 9 version

//      we can use private methods as well

//      fields ( public static final ) <- this keywords are by default
// }

// Interface tells class what to do not how to do
// Allow to achieve abstraction
// It supports multiple inheritance
// It can be used to achieve loose

interface Alloy {
    public static final int a = 10; // wth is this much access modifiers
    public void show(); // here we can see it is telling class what to do
    static void callMe() {
        System.out.println("I am calling static method from Alloy");
    }
    default void showMe() {
        System.out.println("I am calling static method from Alloy");
    }
}

class Pure implements Alloy {
    public void show() {
        System.out.println("Pure class show method");
    }
    public void showMe() {
        System.out.println("Pure class show me method");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Pure one = new Pure();
        one.show();
        one.showMe();
    }
}
