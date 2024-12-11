package Chp10;

public class UsingStringBuffer {

    // String is immutable and StringBuffer is mutable

    public static void main(String[] args) {

        // String with same literal does new String if it has same literal
        // Even if StringBuffer has same literal it allocates new memory & for every StringBuffer it creates new memory if allocated

        StringBuffer s1 = new StringBuffer("Rohit");
        StringBuffer s2 = new StringBuffer("Rohit");

        System.out.println(s1.equals(s2));// here we get false cuz equals method from String class is not overriden in StringBuffer class

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // Mutable : objects are indeed mutable, meaning their contents can be modified after creation
        // Immutable : Objects once created can't be modified

        // StringBuffer is mutable on other hand String is immutable
        StringBuffer one = new StringBuffer("Hello ! ");
        String two = new String("Hello ! ");
        one.append("Rohit");
        two.concat("Rohit");
        System.out.println("StringBuffer : " + one);
        System.out.println("String : " + two);

        // StringBuffer has synchronized methods which makes it system performance slower
    }
}
