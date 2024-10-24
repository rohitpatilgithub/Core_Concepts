package Chp8.FinalKeyword;

// 'final' keyword has various uses
// 1. Variable = Cannot change the value of variable ( it is constant now )
// 2. Method = Cannot override the method
// 3. Class = Cannot extend / inherit the class

class Duck{
    final int i = 1;    // cannot override / manipulate
    final void sum(){   // cannot override
//        i = i + 1;
        System.out.println("Sum : "+i);
    }
}

final class Sick extends Duck{  // cannot extend Sick class
    void display(){
        System.out.println("We have display method in Sick class");
    }
}

public class FinalKey {
    public static void main(String[] args) {
        Sick one = new Sick();
        one.display();
        one.sum();
    }
}
