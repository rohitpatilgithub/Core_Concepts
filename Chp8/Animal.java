package Chp8;

public class Animal {
    String name;
    int age;

    public void initObj(String c , int a) {     // initialize object values
        name = c;
        age = a;
    }

    public void display () {
        System.out.println("Name : " + name + "\nAge : " + age);
    }

    public void eat() {
        System.out.println("I am eating");
    }
    public static void main(String[] args) {
        Animal dog = new Animal();          // initialize object with ref var
        dog.eat();                          // calling methods from Animal class using dot operator
        dog.initObj("Luffy" , 5);     // initializing instance var of Object Animal
        dog.display();
        Bird sparrow = new Bird();
        sparrow.fly();
    }
}
class Bird {
    public void fly() {
        System.out.println("I am flying");
    }
}
