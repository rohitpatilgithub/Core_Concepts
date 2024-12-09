package Chp10.StringMethods;

// Learn about String methods
// 1 .replace()
// 2 .replaceFirst()
// 3 .replaceAll()

public class StringMethods4 {
    public static void main(String[] args) {
        String a = "this is demo";

        // 1 .replace() : Replaces target substring of this string with the specified string
        System.out.println(a.replace("is","was"));

        // 2 .replaceFirst() : Replaces target substring of this string and replacement is done with initial substring found
        System.out.println(a.replaceFirst("i","o"));

        // 3 .replaceAll() : Replaces target substring of this string with the specified string
        //                   Regex is required ( regular expression )
        //                   '.' regex replaces the 'target' and removes spaces if available
        //                   '.*' regex replaces the 'target' , removes spaces if available also '*' regex removes the remaining part of string
        //                   '*' regex replaces the 'target' , does not remove
        System.out.println(a.replaceAll("s.","i"));

        System.out.println(a.replaceAll("is*","was"));
    }
}
