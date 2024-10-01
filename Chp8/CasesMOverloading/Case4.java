package Chp8.CasesMOverloading;

public class Case4 {
    // Case 4 for Method Overloading in Polymorphism

    // Case : In Method overloading
    //        we have give
    // Ans -> Even there's Automatic Promotion , compiler gets confused what to promote ( sequence of args ) and
    //        which method to call any apply
    // Condition -> Promotion of Data type in methods accordingly might get crucial if it does not perform promotion

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
