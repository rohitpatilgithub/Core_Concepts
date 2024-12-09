package Chp10.StringMethods;

// Learn about String methods
// 1 .concat()
// 2 .join()

// 1 .subSequence()
// 2 .substring()

public class StringMethods3 {
    public static void main(String[] args) {
        String a = "Ro";
        String b = "hit";
        String c = "han";

        // .concat() to join one string at the end of given string
        System.out.println(a.concat(b));

        // .join() is static method in String class
        // .join('delimiter : any symbol / String but no null' , 'elements : Strings you want to join with delimiter')
        System.out.println(String.join(",",a,c));



        String name = "Anand Kishan Patel";

        // .subSequence('begin from index n','end at m index point where [m = m - 1] ')
        // it is represented as Sequence of characters not a string directly
        System.out.println(name.subSequence(3,9));

        // .substring('begin from index n','end at index m where [m = m - 1]')
        // it is represented as String
        System.out.println(name.substring(3,10));
        System.out.println(name.substring(6));

    }
}
