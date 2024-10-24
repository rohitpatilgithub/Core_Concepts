package Chp8.SuperKeyword;

// 'super' keyword is basically the reference variable for parent class not the current class / object we are in.
// 'super' vs 'super()'
// super() -> constructor
// super -> keyword
// We can use 'super' to refer instance and invoke methods from PARENT CLASS

class Spiderman {
    int web = 20;
}

class Spiderwoman extends Spiderman {
    int web = 10;
    void getWeb(int web){
        System.out.println("Parameterized value : "+web);   // parameterized value
        System.out.println("Spiderwoman has : "+this.web);  // 'this' keyword
        System.out.println("Spiderman has : "+super.web);   // 'super' keyword
    }
}

public class Superhero extends Spiderwoman{
    public static void main(String[] args) {
        Superhero one = new Superhero();
        one.getWeb(30);
    }
}