package Chp1;

public class Static_Variables {

    static int num = 10;    // static instance variable stored in Method area ( Meta space ) instead of heap
    // accessing static instance variable in void method is same like normal instance variable

    static void numAccess() { // how we can use static variable in static method ;
        // explain static method , how can we use it ? what's purpose in real world for non static and static variables in static methods
        Static_Variables one = new Static_Variables();
    }

    public static void main(String[] args) {
        Static_Variables one = new Static_Variables();
        one.num = 200;
        Static_Variables two = new Static_Variables();
        System.out.println(two.num); // here we don't get origin value (10) but we do get (200) why because
        // static instance variables memory share same value with everyone , if it gets updated then it is same for all new objects too....
    }
}
