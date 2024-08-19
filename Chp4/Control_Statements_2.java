package Chp4;

public class Control_Statements_2 {
    public static void main(String[] args) {
        // Iteration or looping statements : We initialize , we give a condition , we do increment / decrement

        // block of code will execute till condition is true
        // each time a block is executed , each time initialized value is incremented / decremented

// ----------------------------------------------------------------------------------------------------------------

//        Example :
//        for ( initialize ; condition ; increment / decrement ) {
//            block
//        }

        for( int i = 1 ; i <= 5 ; i++) {
            System.out.println("Hello : " + i);
            //Output --> Hello : initialized value
        }

//----------------------------------------------------------------------------------------------------------------

//        Example :
//        while ( condition ) {
//            block
//        }

        int a = 3;
        while (a > 0) {
            System.out.println("Hello World");
            a--;
        }

//----------------------------------------------------------------------------------------------------------------

//        Example :
//        do {
//            block
//        } while ( condition );

        int b = -1;
        do {
            System.out.println("Executed before checking condition");
        }while (b > 0);

        // Jump statements : includes
        // 1. return : it will return some value
        // 2. break : immediately quits currents iteration and goes to initial statement of the following loop
        // 3. continue : continue the loop with next iteration and skip the current part of block while execution
    }
}
