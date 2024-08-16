package Chp1;

public class Instance_Variables {

    int myVariable = 10; // this is instance variable stored in heap memory

    // simple method

    void sum() {
        int a = myVariable + 10; // here we use instance variable
        System.out.println(a);
    }// simple method ends here

    // static method has different approach to access instance variable

    static void mutliply() {
        Instance_Variables one = new Instance_Variables();
        int b = one.myVariable * 10;
        System.out.println(b);
    }// static method ends here

    public static void main(String[] args) {
        Instance_Variables one = new Instance_Variables();
        one.sum(); // to call normal method
        mutliply(); // to call static method
    }
}
