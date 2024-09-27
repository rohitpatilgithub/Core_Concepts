package Chp8.CasesMO;

public class Case1 {
    // Case 1 for Method Overloading in Polymorphism

    // Case : What if we enter invalid argument in Method overloading
    // Ans -> There's thing called Automatic Promotion with promotes
    //        one type of variable to another implicitly if no datatype is matched

    void callMe(int a) {
        System.out.println("Hi I'm int");
    }

    void callMe(String a) {
        System.out.println("Hi I'm String");
    }

    public static void main(String[] args) {
        Case1 one = new Case1();
        one.callMe('a'); // we have invalid input 'a' is char

        // 'a' char is automatically promoted to int which will call the method with 'int' parameter in it

    }

}
