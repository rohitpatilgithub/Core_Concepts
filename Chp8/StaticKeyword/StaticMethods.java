package Chp8.StaticKeyword;

// Static methods belongs to class not an object
// We can call static method with class name : ClassName.method()
// Memory management can be done using static keyword

// Rule 1. Static method belongs to class not object
// Rule 2. Static method can be accessed by class name directly

class Qwerty{
    static void show(){
        System.out.println("Showing Qwerty keyboard");
    }
}

public class StaticMethods {
    int i = 10;
    static void display(){
        System.out.println("Showing method from current class");
    }
    public static void main(String[] args) {
        Qwerty.show();// why there's error here
        display();// this works too
    }
}
