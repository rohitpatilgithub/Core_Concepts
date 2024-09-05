package OOPS;

public class Animal {
    public void eat() {
        System.out.println("I am eating");
    }
    public static void main(String[] args) {
        System.out.println("main");
        Animal dog = new Animal();
        dog.eat();
        Bird sparrow = new Bird();
        sparrow.fly();
    }
}
class Bird {
    public void fly() {
        System.out.println("I am flying");
    }
}
