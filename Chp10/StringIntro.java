package Chp10;

// Strings
// 1. Non - primitive data type
//
// 2. String is sequence of characters / array of characters
//
// Note : 'CharSequence' interface represents String chars
//
// 3. String is a class
// Which is
// public final class String extends Object implements CharSequence , Serializable , Comparable {
//   ////////
// }

// 4. String s = new String();
// String is an Object but immutable object

// 5. To create string we have 3 types of classes
// 1.String
// 2.StringBuffer
// 3.StringBuilder

public class StringIntro {
    public static void main(String[] args) {

//     String is sequence of characters / array of characters
       char[] c = {'R','o','h','i','t'};
       String name = new String(c);
        System.out.println(name);
        String surname = "Patil";
    }
}