package Chp11;

import java.util.*;

public class EnumerationIntro {

    // Enumeration is cursor used for iteration to retrieve objects one by one
    // Was introduced in JDK 1.0
    // Only works with legacy class ( ie vector & stack )
    // Enumeration can be get by elements() method
    // Methods of enumeration cursors are :
    // a. hasMoreElements()     b. nextElement()
    // We can retrieve elements only in forward direction
    // Only for read operations

    public static void main(String[] args) {
        Vector vec = new Vector();
        vec.add("Rohit");
        vec.add("Rohan");
        vec.add("Shrikant");
        System.out.println(vec);
        vec.listIterator();

        // We can use Iterator and ListIterator with Legacy class
        // Not vice versa
        Iterator one = vec.listIterator();
        System.out.println(one.next());

        // Specialized cursor / iterator for enumeration
        // This is read only with forward direction only
        Enumeration two = vec.elements();
        while (two.hasMoreElements()) {
            System.out.println(two.nextElement());
        }
    }
}
