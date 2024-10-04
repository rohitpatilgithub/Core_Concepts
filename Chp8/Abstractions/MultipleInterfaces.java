package Chp8.Abstractions;

// Interface supports Multiple Inheritance

interface Aluminium {
    void show();
}
interface Gold {
    void display();
}
public class MultipleInterfaces implements Aluminium , Gold {
    public void show() {
        System.out.println("This is Aluminium");
    }

    @Override
    public void display() {
        System.out.println("This is Gold");
    }

    public static void main(String[] args) {
        MultipleInterfaces one = new MultipleInterfaces();
        one.show();
        one.display();
    }
}
