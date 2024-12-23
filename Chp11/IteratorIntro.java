package Chp11;

import java.util.*;

public class IteratorIntro {
    public static void main(String[] args) {
        // Iterator is for all class in Collection which implements the Iterator interface
        // ListIterator is only for List classes

        List ls = new ArrayList();
        ls.add(10);
        ls.add(20);
        ls.add("Rohit");
        ls.add("Rahul");

        Iterator one = ls.iterator();
        // Iterator has basic functionalities like :
        System.out.println("hasNext function : " + one.hasNext());
        System.out.println("next function : " + one.next());
        one.remove(); // will remove the element where cursor is placed currently
        System.out.println("ArrayList after remove function : "+ls);

        ListIterator two = ls.listIterator();
        // ListIterator has basic functionalities of Iterator also few extra features like :
        // hasPrevious , previous , set

        two.next();
        two.set("Rohan");
        two.previous();

        while (two.hasNext()){
            System.out.println(two.next());
        }

        System.out.println("hasPrevious function : " + two.hasPrevious());
        while(two.hasPrevious()){
            System.out.println(two.previous());
        }
    }
}
