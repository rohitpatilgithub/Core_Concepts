package ExtraOrdinaryThings;

// It is nearly impossible to get multiple inheritance
// But, Interface helps to understand the concept

interface Vehicle {
    String name = "";
    default void show() {
        System.out.println("I am calling default method");
    }
    static void display() {
        System.out.println("Display method");
    }
}

class Dog implements Vehicle {
    public void show() {
        System.out.println("Display from Dog");
    }
    public void display(){
        System.out.println("Display from Dog");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.show();
        one.display();
    }
}
