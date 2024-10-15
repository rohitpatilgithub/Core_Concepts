package Chp8.Encapsulation;

// Encapsulation in java is mechanism of wrapping data ( var )
// and code acting on data ( methods ) together as single unit

// Basically we are hiding the info and wrapping it

// To achieve encapsulation
// 1. Declare variables of class as private
// 2. Public setter and getter methods to modify and view var values

class Person{

    private String name; // this is data hiding ( only access to current class )

    public void setName(String name1) {
        name = name1;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulate {
    public static void main(String[] args) {
        Person one = new Person();
        one.setName("Rohit");
        String a = one.getName();
//        System.out.println(a);
    }
}
