package Chp8.CasesMOverloading;

public class Case2 {
    // Case 2 for Method Overloading in Polymorphism

    // Case : In Method overloading
    //        where we have one method parameter as Object ( parent )
    //        and String for another will it choose child / parent
    // Ans ->  Even there's Automatic Promotion , promotes
    //        one type of variable to another implicitly if no datatype is matched
    // Condition -> But if it doesn't perform automatic promotion then Here we need to notice that even though
    //              Object is parent class it is preferring child class

    void callMe(Object a) {
        System.out.println("Hi I'm Object");
    }

    void callMe(String a) {
        System.out.println("Hi I'm String");
    }

    public static void main(String [] args) {
        Case2 one = new Case2();
        // one.callMe('a'); // here we get Object
        // one.callMe("abc"); // here we get String
    }
}
