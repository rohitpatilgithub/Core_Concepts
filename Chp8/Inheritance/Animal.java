package Chp8.Inheritance;

public class Animal {                           // Animal is Parent / super class

    void eat(String what) {
        System.out.println("I am : " + what);
    }
}
class Dog extends Animal{                       // Dog is child / sub class
    public static void main(String[] args) {
        // Inheritance means inheriting properties from parent class ( not all properties are inherited )
        // Inheritance also means ' IS A ' relationship
        // Uses : 1. Code re-usability
        //        2. We can achieve polymorphism ( i.e method overriding ) with help of inheritance
        Dog ok = new Dog();
        ok.eat("Eating");
        // Types of inheritance : 1. Simple
        //                        2. Multi level
        //                        3. Hierarchical
        //                        4. Multiple
        //                        5. Hybrid
        // Java don't have 4,5 type of inheritance

    }
}
