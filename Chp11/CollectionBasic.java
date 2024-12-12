package Chp11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionBasic {

    public static void main(String[] args) {

        // As we know we can create object of any class
        // Thus objects can be created from any class which belongs to List & Maps

        // Here we created object of reference variable 'al'

        ArrayList al = new ArrayList();
        al.add(10);
        al.add("20");

        // We know that Collection itself is an interface, but we can create an object with it
        // Even List ( Parent )  is interface , it can create an Object if the respective class ( child ) promises to implement all the instructions
        List l1 = new ArrayList();
        l1.add(0);

        // Map functions are different from List example : In HashMap , we need key and respective value if we want to add/put
        HashMap hm = new HashMap();
        hm.put(101,"Rohit");
        hm.put(102,"Rohan");
        hm.put(103,"Rahul");
    }
}
