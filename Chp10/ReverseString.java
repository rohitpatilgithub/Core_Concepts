package Chp10;

public class ReverseString {

    // We will reverse String
    // Also check whether it is palindrome or not

    public static void main(String[] args) {
        String rev = "Rohit";
        String reversed = "";
        for(int i = (rev.length()-1) ; i >= 0; i--){
            reversed += rev.charAt(i);
        }
        if(reversed.equalsIgnoreCase(rev)){
            System.out.print(rev + " : ");
            System.out.println(reversed);
            System.out.println("Yes , our String is a palindrome");
        }
        else {
            System.out.println("No , our String is not palindrome");
        }
    }
}
