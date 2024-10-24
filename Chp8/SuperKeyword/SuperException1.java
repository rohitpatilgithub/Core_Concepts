package Chp8.SuperKeyword;

// 'super' to invoke immediate parent class method

class A {
    void show(){
        System.out.println("I'm in A");
    }
}

class B extends A {
    void show(){
        System.out.println("I'm in B");
    }
    void display(){
        System.out.println("Overriding of method :");
        show();
        System.out.println("Access of parent method using super keyword :");
        super.show();
    }
}
public class SuperException1 extends B {
    public static void main(String[] args) {
        SuperException1 one = new SuperException1();
        one.display();
    }
}
