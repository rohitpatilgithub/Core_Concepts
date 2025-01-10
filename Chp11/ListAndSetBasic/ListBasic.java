package Chp11.ListAndSetBasic;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListBasic {
    public static void main(String[] args) {
        List one = new ArrayList();
        // Insertion method used here where it adds elements sequentially
        one.add(10);
        one.add(20);
        one.add(30);
        System.out.println("Retrieving Object : " + one);
        System.out.println("Iterator iterator : ");

        // We can use iteration to get/retrieve the elements sequentially
        Iterator itr = one.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // List can store multiple duplicate values
        one.add(30);
        one.add(null);
        one.add(null);

        System.out.println("List Iterator : ");

        // List has its own ListIterator for iteration with some extra features
        List go = new ArrayList();
        go.add(10);
        go.add(20);
        ListIterator two = go.listIterator();
        two.previous();
        while (two.hasPrevious()){
            System.out.println(two.previous());
        }
    }
}
