package Chp8.CasesMO;

public class Case3 {
    // Case 3 for Method Overloading in Polymorphism

    // Case : In Method overloading
    //        we have automatic promotions in which
    //        there's promotion of int to float then
    //        will it work in below conditions
    // Ans -> Even there's Automatic Promotion , compiler gets confused what to promote ( sequence of args ) and
    //        which method to call any apply
    // Condition -> Promotion of Data type in methods accordingly might get crucial if it does not perform promotion

    void callMe(int a , float b) {
        System.out.println("Hi I'm int float");
    }

    void callMe(float a , int b) {
        System.out.println("Hi I'm float int");
    }

    public static void main(String[] args) {
        Case3 one = new Case3();
        one.callMe(10,2.5f);
        one.callMe(10.5f,2);

//        one.callMe(10,2); it cannot promote like this automatically
//        from int to float / int to double cuz compiler gets confused

//         one.callMe("a",2); can promote itself
//         if we have parameters ( String a , float b ) or vice versa
    }
}
