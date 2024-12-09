package Chp10.StringMethods;

// Learn about String methods
// 1 .indexOf()
// 2 .lastIndexOf()
// 3 .charAt()
// 4 .contains()
// 4 .startsWith()
// 4 .endsWith()

public class StringMethods5 {
    public static void main(String[] args) {
        String a = "Rohito";

        // 1 .indexOf() : index of given 'char' / 'string'
        //                Traversing from 0th index
        System.out.println(a.indexOf('t'));

        // 2 .lastIndexOf() : index of given 'char' / 'string'
        //                    Traversing from last index
        System.out.println(a.lastIndexOf('o'));

        // 3 .charAt() : Returns 'char' from given index number
        System.out.println(a.charAt(2));

        // 4 .startsWith() : Checks whether our string starts with given 'char'/'string'
        System.out.println(a.startsWith("R"));

        // 5 .endsWith() : Checks whether our string ends with given 'char'/'string'
        System.out.println(a.endsWith("t"));
    }
}
