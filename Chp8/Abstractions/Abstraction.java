package Chp8.Abstractions;

// Abstraction means displaying the interface / features and hiding the details of implementations / functions
// Example in real life : For driver external features are displayed like brakes , steering wheel , etc... a
//                        And the functions and all internal functions are hidden

// Abstraction
// 1. Abstract class ( 0-100 % Abstraction possible )
// 2. Interfaces ( 100 % Abstraction possible )

// 5 things that derives Abstraction in Abstract class
// 1. A method without body known as abstract method must be present
// 2. If a class has abstract method in it , there must be use of abstract keyword in it ( for method as well as class )
// 3. If a class inherits abstract class then we should declare the body of method
// 4. Abstract methods in abstract class are meant to be overriden otherwise there would be compile-time error
// 5. We cannot create object of Abstract class

abstract class Vehicle{
    int tyres;
    abstract void start();
}

class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Starts with Key");
    }
}

class Scooter extends Vehicle {
    void start() {
        System.out.println("Starts with Kick");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle one;
        Car tata = new Car();
        tata.start();
        Scooter honda = new Scooter();
        honda.start();
    }
}
