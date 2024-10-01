package Chp8.CasesMOverriding;

// Case 2 for Method Overriding in Polymorphism

// Case : Relationship between Overriding and Access modifier ?
// Ans -> In parent class if we are providing Access modifier to method then
//        in child class the method should get access modifier which is
//        greater and has more access ( superior to parent )

class Alloy {
    void callMe() {      // ex. this is 'default'
        System.out.println("I am Alloy");
    }
}
class Pure extends Alloy{
    public void callMe() {             // this should have 'public'
        System.out.println("I am Pure");
    }
}
public class Case2 {
    public static void main(String[] args) {
        Alloy one = new Alloy();
        one.callMe();
    }
}
