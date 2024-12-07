package Chp10.StringMethods;

// Learn about String methods
// 1 .length() : To check whether length of given string
// 2 .isEmpty() : To check whether given string is empty / not
// 3 .trim() : To trim the string / remove empty and unnecessary spaces from string [ only from front and back ]

public class StringMethods1 {
    public static void main(String[] args) {
        // Code something to check whether given string is empty / not

        String s = " "; // Note : If we declare 's' = 'null' then it will throw exception

        // 1st way
        if(s.length() > 0) {
            System.out.println("String isn't empty");
        }
        else {
            System.out.println("String is empty");
        }

        // 2nd way
        if(s.isEmpty() == true){
            System.out.println("String isn't empty");
        }
        else {
            System.out.println("String is empty");
        }

        // 3rd way
        if(s.trim().length() == 0){
            System.out.println("String is empty");
        }
        else {
            System.out.println("String isn't empty");
        }
    }
}
