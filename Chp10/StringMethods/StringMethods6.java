package Chp10.StringMethods;

// Learn about String methods
// 1) Case conversion
//    .toLowerCase()
//    .toUpperCase()
// 2) Type conversion
//    .valueOf()
//    .toCharArray()

public class StringMethods6 {
    public static void main(String[] args) {
        String a = "RohiT";

        // .toLowerCase() : Converts string to lowercase
        System.out.println(a.toLowerCase());

        // .toUpperCase() : Converts string to uppercase
        System.out.println(a.toUpperCase());

        // .valueOf() : Converts different values into string
        //              This is static method
        int b = 94;
        int d = 10;
        String str = String.valueOf(b);
        System.out.println("Int converted to String : "+ str);
        System.out.println("Int 10 + String 94 : "+ ( d + str ) );

        // .toCharArray() : Converts given string to sequence of Char
        //                  Length of String is equal to char array length
        char[] c = a.toCharArray();
        System.out.println(c[0]);
    }
}
