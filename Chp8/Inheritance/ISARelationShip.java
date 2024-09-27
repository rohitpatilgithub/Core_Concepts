package Chp8.Inheritance;

public class ISARelationShip {
}

// Inheritance types :
// 1. Simple
// 2. Multiple
// 3. Hierarchical
// 4. Diamond
// 5. Multi - level

// Inheritance has advantages :
// 1. Code reusability
// 2. Cost cut
// 3. Reduce redundancy

class A{
    void showA() {
        System.out.println("Class A");
    }
}
class B extends A{
    void showB() {
        System.out.println("Class B");
    }
}
class C extends A {
    void showC() {
        System.out.println("Class C");
    }
    public static void main(String[] args) {
        A one = new A();
        B two = new B();
        C three = new C();
        one.showA();
        System.out.println("-------------------");
        two.showA();
        two.showB();
        System.out.println("-------------------");
        three.showA();
//        three.showB();
        three.showC();
    }
}
