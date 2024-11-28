package Chp10;

// Immutable : If once created no changes can be made
// Strings are immutable

// If multiple objects share same literal then it would just refer it
// instead of creating separate for each which is fast

// Why ?
// When multiple objects refer same literal / share same literal
// If we change the literal for one object
// then it would be same for others too., which is risky

// How ?
// When we want to add / modify literal
// It creates new object ( Modified ) in Heap and SCP keeps only the excess data
// For ex :

public class StringImmutable {
    public static void main(String[] args) {
        // String 's' present in heap Area as well as literal 'Rohit' in SCP
        String s = "Rohit";
        // We just created a new object in Heap area as well as literal in SCP 'Java'
        s.concat(" Java");
        // Here we get literal of 's' which is 'Rohit'
        System.out.println(s);
        // Here we created object and initialized it to original object 's'
        // so now it points to latest object with literal 'Rohit Python'
        s = s.concat(" Python"); // this is in SCP
        System.out.println(s);
    }
}