package Chp8.ThisKeyword;

// 3. 'this' keyword can be used to invoke current class constructor

public class ThisException3 {
    ThisException3(){
        this(3);    // Using 'this' to invoke parameterized constructor
        System.out.println("No arg constructor");
    }

    ThisException3(int a){
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        ThisException3 one = new ThisException3();
    }
}
