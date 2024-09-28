package Chp8.Constructors;

// Basic Example of parameterized constructor

class Account{
    int limit , balance;
    boolean withdrawal;
    Account(int limit, int b , boolean c) { // Account class will be having few instance which will be parameterized by constructor
//        limit = a;
//        balance = b;
//        withdrawal = c;
        // OR
        this.limit = limit;
        this.balance = b;
        this.withdrawal = c;
    }
    void eligibility() {    // will check whether consumer can / cannot withdraw money
        if(balance <= limit && withdrawal == true) {
            System.out.println("You cannot withdraw");
        }
        else {
            System.out.println("You can withdraw");
        }
    }

}
public class Practice {
    public static void main(String[] args) {
        Account ok = new Account(100,200 , true);   // args of constructor for Account object
        ok.eligibility();
    }
}