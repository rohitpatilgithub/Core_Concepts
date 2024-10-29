package Chp8.StaticKeyword;

// static block executes automatically when class is loaded in the 'memory'
// before 1.6 Java ver. we can compile the program with only a static block
// after 1.6 ver. it became mandatory to
// have main method in program along with static block only then
// the class would load

// Uses of static block
// 1. If we want to execute and perform some activity while class loading
// Ex : To execute native methods ( contains code of diff lang )
// 2. To initialize static variables

class Does{
    static {
        System.out.println("Static block from Does");
    }
}

public class StaticBlock {
    public static void main(String[] args) {    // Here we need to give main method to
        System.out.println("Hello");
    }
    // Before 1.6 ver. static block , var (any static data ) used to execute sequentially then main method will be executed
    // After 1.6 ver. first checks static data and then checks availability of main method
    // 1. If no main method - error
    // 2. If contains main method - identifies static data then checks main then executes static first then main

    static {
        System.out.println("Static block");
    }
}
