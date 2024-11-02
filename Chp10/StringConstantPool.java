package Chp10;
class All{

}

class Ball{

}
public class StringConstantPool {

    // Before 1.6 it used to store literals in Method Area
    // 1.7 onwards it now stores in Heap Area ( SCP / SLP )

    // SCP / SLP is not applicable for garbage collection
    // cuz it references internally

    public static void main(String[] args) {
        String one = new String("Rohit");
        // Here we have created two objects so garbage collections hits
        // and deletes the external object 'one' cuz it is not referring anything
        String name = "Rohit";
        // Here we have declared only one object which has same value
        // as above thus it doesn't create any object
        // Now JVM won't point the 'Rohit' internally
        // 'one' points 'Rohit' in SCP
        System.out.println(one.hashCode());
        System.out.println(name.hashCode());
        // If it is creating a object and deleting
        // then why don't the new object gets new hashcode why it refer the old
        // then can we do same it Object
        // like All a = new All();
        // Ball b = a; // this ain't running
    }
}
