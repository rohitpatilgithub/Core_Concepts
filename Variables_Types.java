public class Variables_Types {

    int instanceVariable; // this is instance variable for class Variable_Types

    static int staticVariable;  // this is static variable


    public static void main(String[] args) {

        // Q : What is variable ?
        // Variable is name of memory location that can store data

        int a = 10; // here 'a' is variable and 10 is literal
        System.out.println("Value of a before : " + a);

        // value of variable can be changed

        a = a + 10 ; // like this 'a' changes its literal to 20
        System.out.println("Value of a after : " + a);

    }
}
