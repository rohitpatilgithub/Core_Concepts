package Chp10;

// There are various constructors in String class
// public String ()
// public String (String a)
// public String (StringBuffer b)
// public String (StringBuilder c)
// public String (char[] d)
// public String (byte[] d)
// many more...

public class StringConstructor {
    public static void main(String[] args) {
        // To store password we use char[] (Char array) instead of String
        // here's why
        // 1. String objects are immutable and it is stored in SCP
        //    SCP doesn't hit garbage collection thus chances of getting hacked increases
        // 2. Char arrays doesn't provide us value directly as it does in String
        //    thus char is better option
        String pass = "abc";
        char [] pass1 = new char[]{'a','b','c'};
        System.out.println("Password using String : "+pass);    // it is explicitly displays String value
        System.out.println("Password using char[] : "+pass1);   // it displays char Id instead of value
    }
}
