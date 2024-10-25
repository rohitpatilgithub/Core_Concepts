package Chp8.StaticKeyword;

// Rule 3. Static methods can only access static data ( not non-static data )
// Rule 4. Static methods can only access static method
// Rule 5. Static method cannot refer 'this' / 'super' keyword

public class StaticMethods2 {

    int nonStaticData = 10;
    static int staticData = 20;

    void show(){
//      System.out.println(nonStaticData);    we cannot call non static data here
        System.out.println(staticData);// we can call static data
        showStatic(); // we can access static method in non - static
        System.out.println("Showing non static method");
    }

    static void showStatic(){
//        this.show(); we cannot use 'this' or 'super' in static method
//        show(); // we cannot access non - static method in static
        System.out.println("Showing static method");
    }

    public static void main(String[] args) {
        StaticMethods2 one = new StaticMethods2();
        one.show();
    }
}
