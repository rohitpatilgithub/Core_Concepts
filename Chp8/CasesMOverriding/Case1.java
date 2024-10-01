package Chp8.CasesMOverriding;

// Case 1 for Method Overriding in Polymorphism

// Case : Do overriding method must have same return type ?
// Ans -> After 5.0 it is possible to have different return type but
//        Child's return type should be sub-type of parents return type
//        This phenomenon is called Covariant return type



class Parent {
    Object callMe() {   // here it is compulsory to have Parent class return type
        System.out.println("I am Parent");
        return null;
    }
}
class Child extends Parent {
    Number callMe() {   // here return type must be sub-type / child of parent class
        System.out.println("I am Child");
        return null;
    }
}

public class Case1 {

    public static void main(String[] args) {
        Parent one = new Parent();
        one.callMe();
    }
}
