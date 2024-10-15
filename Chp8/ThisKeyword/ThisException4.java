package Chp8.ThisKeyword;

// 4. 'this' keyword can be used to pass an argument in method call

public class ThisException4 {
    void callMe(ThisException4 one){
        System.out.println("Calling");
    }

    void really(){
        callMe(this);
        System.out.println("Really you wanna call ?");
    }

    public static void main(String[] args) {
        ThisException4 one = new ThisException4();
        one.really();
    }
}
