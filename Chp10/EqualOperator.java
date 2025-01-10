package Chp10;

// '==' operator is for reference ( address ) comparison
// '==' checks whether two objects are referring to same memory location

// '.equals()' is used to compare reference ( address ) and it is method from Object class
// '.equals()' checks whether two objects are referring same memory in Object class
// but '.equals()' has been override in String class
// thus after overriding it now checks the content / value of Object

public class EqualOperator {
    public static void main(String[] args) {
        String a = "Rot";
        String b = "Rot";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a==b);
        String a1 = new String("Ro");
        String b1 = new String("Ro");
        System.out.println(a1.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(a1==b1);// kasa ky 'false' hashcode is same bro
        // So is it something like hashcode we are getting is from SCP / SLP
        System.out.println(a1.equals(b1));
    }
}
