public class Main_Method {      // class Name
    public static void main(String... args) { // how ?
        // 1. Access modifier ( public )
        // 2. Keyword to access method without making Object ( static )
        // 3. Keyword for method with no any return value ( void )
        // 4. Method name ( main )
        // 5. Parameter's for the method ( String[] args )
        System.out.println("Hello world");
        // 1. Order of access modifier can be changed : static public void ...
        // 2. We can declare String[] args in any form : String args[] / String[] args / String []args
        // 3. You can changed identifier name from 'args' to anything in 'String[] args'
        // 4. We can use var args instead of 'String[] args' to 'String... args'
    }
}
