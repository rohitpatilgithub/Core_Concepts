package Chp11;

import java.util.ArrayList;

public class CollectionInterface {

    // Collection is an interface present in java.util package ( 1.2v )
    // Any class in Collection interface does not inherit it directly
    // Collection is a root interface thus classes also implement the methods from Collection

    // Some methods that most of the class implement from Collection interface are
    // public boolean add(Object obj) {}
    // public boolean addAll(Collection c) {}

    // public boolean remove(Object obj) {}
    // public boolean removeAll(Collection c) {}

    // void clear() {}
    // boolean contains(Object obj) {}
    // boolean containsAll(Collection c) {}

    // boolean isEmpty() {}
    // int size() {}
    // Iterator iterator() {}


    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println(al);
        System.out.println(al.add("301")); // prints true because method return type is boolean

        ArrayList al1 = new ArrayList();
        al1.add(400);
        al1.add(500);
        al.addAll(al1);
        System.out.println(al);
    }
}
