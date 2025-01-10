package Chp11.ListAndSetBasic;


import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetBasic {
    public static void main(String[] args) {
        Set one = new HashSet();
        // Insertion method is not used here
        // It stores using hash values not on basis of index
        one.add(10);
        one.add(20);
        one.add(30);
        System.out.println("Retrieving Object : " + one);
        System.out.println("Iterator iterator : ");

        // We can use iteration to get/retrieve the elements sequentially
        Iterator itr = one.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Set cannot store multiple duplicate values
        // It does not accept it in the Set
        one.add(30);
        one.add(null);
        one.add(null);

        // Set does not have its own iteration like ListIterator
    }
}
