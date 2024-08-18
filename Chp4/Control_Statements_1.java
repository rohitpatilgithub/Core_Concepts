package Chp4;

public class Control_Statements_1 {
    public static void main(String[] args) {
//         We control the flow of our program by using control statement

//         3 types of control statement's :
//                 1. Selection or Conditional statement : if , else , else-if , nested-if , switch
//                 2. Iteration or Looping statement : for , while , do-while
//                 3. Jump statements : break , continue , return

//-----------------------------------------------------------------------------------------------------------

//         Selection / Conditional statement : From multiple block of code only one is being selected

//        Example of else-if :

//        if ( condition true ) then execute the {
//              block
//       }
//       else if ( condition true ) then execute {
//              block
//       }
//        else {
//             execute this block
//      }

        int a = 10;
        if ( a == 10 ) {
            System.out.println("Number is 10");
        }
        else if( a < 10 ) {
            System.out.println("Small");
        }
        else {
            System.out.println("Big");
        }

//-----------------------------------------------------------------------------------------------------------

//      Example of nested if :

//      if( condition true ) then execute {
//          block  if ( condition true ) then execute
//              { block }
//      }
        int b = 20;
        if( b > 10) {
            if( b == 20 ) {
                System.out.println("Number is 20");
            }
        }

// -----------------------------------------------------------------------------------------------------------

        // Example of switch statements :

//      switch ( variable to be tested ) {
//          case value 1 :
//                     break
//          case value 2 :
//                     break
//          default :
//                     break
//      }

        int c = 30;
        switch (c) {
            case 1 :
                System.out.println("It is 30");
                break;
            case 2 :
                System.out.println("It is 20");
                break;
            case 3 :
                System.out.println("It is 30");
                break;
            default :
                System.out.println("None of the above");
                break;
        }
    }
}
