package Chp10.StringMethods;

// Learn about String methods
// 1 .equals() : To check whether value given strings are equal ( case-sensitive )
// 2 .equalsIgnoreCase() : To check whether given strings are equal even if there is cases are different ( not case-sensitive )

// 1 .compareTo() : To check and compares the unicode values of given strings
//                It calculates the unicode value of both and
//                a) If difference of unicode value is 0 then both are same
//                b) If difference of unicode value is positive then our string has greater unicode than other
//                c) If difference of unicode value is negative then our string has negative unicode than other
// 2 .compareIgnoreCase() : This also works are simple '.compareTo()' method but here we neglect the case-sensitive

public class StringMethods2 {
    public static void main(String[] args) {
        String a = "Rohit";
        String b = "Rohan";
        String a1 = "rOHIT";
        String b1 = "rOHAn";

        // '.equals()'
        System.out.println(".equals() method : " + a.equals(b));

        // '.equalsIgnoreCase()'
        System.out.println(".equalsIgnoreCase() method : " + a.equalsIgnoreCase(a1));

        // '.compareTo()'
        System.out.println(".compareTo() method : " + a.compareTo(b));

        // '.compareIgnoreCase()'
        System.out.println(".compareIgnoreCase() method : " + b.compareToIgnoreCase(b1));
    }
}
