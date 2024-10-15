package Chp8.ThisKeyword;

// 2. 'this' keyword can be used to invoke current class method (implicitly)

public class ThisException2 {

    void sum(){
        System.out.println("This is sum method");
    }

    void diff(){
        //sum(); OR Here compiler automatically uses 'this' keyword (implicit)
        this.sum(); // 'this' keyword invokes another method
        System.out.println("This is diff method");
    }

    public static void main(String[] args) {
        ThisException2 one = new ThisException2();
        one.diff();
    }
}
