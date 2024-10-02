package Chp8.CasesMOverloading;

public class Case4 {
    // Case 4 for Method Overloading in Polymorphism

    // Case : In Method overloading how can we use var args
    // Ans -> We can just use it as parameters and the conditions will decide whether it will call the var args or any variable
    // Condition -> If there's single argument entered by user then it won't call the var args
    //              The only time it will call var args is if we have blank argument or we have multiple arg of that data type

    void callMe(int a) {
        System.out.println("Hi I'm int method");
    }

    void callMe(int... a) {
        System.out.println("Hi I'm var args method");
    }

    public static void main(String... args) {
        Case4 one = new Case4();
        one.callMe(10,2,34);// var args
        one.callMe();// var args
        // here var args has least priority because no method shows interest then var args method gets the chance
    }
}
