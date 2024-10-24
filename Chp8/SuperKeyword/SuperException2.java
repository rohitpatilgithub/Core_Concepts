package Chp8.SuperKeyword;

// 'super' to invoke immediate parent class constructor

class Apple {
    Apple() {
        System.out.println("Constructor of Apple");
    }
}

class Mango extends Apple {
    Mango(){
        super();    // super vs super()
        // super -> keyword
        // super() -> when we need to call constructor
        System.out.println("Constructor of Mango");
    }
}

public class SuperException2 extends Mango{
    public static void main(String[] args) {
        SuperException2 one = new SuperException2();
    }
}
