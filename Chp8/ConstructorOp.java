package Chp8;

public class ConstructorOp {
    int i;
    ConstructorOp(int num) {
        System.out.println("Parameterized constructor");
    }
//    ConstructorOp() {
//        System.out.println("No arg constructor");
//    }
    public static void main(String[] args) {
        System.out.println("Hi");
        ConstructorOp on = new ConstructorOp(10);
        // until u initialize object , u won't be able to compile code
    }
}
