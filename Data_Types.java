public class Data_Types {
    public static void main(String[] args) {

        int a = 10;

        // duh , it is primitive where variable "a" act as label in stack memory which contains value "10"

        String name = "Rohit";
        name.contains("R");// yup this is a method call from built-in class "String"

        // above we can see there's something called object and method being created and used respectively
        // "name" is reference variable of class String also we know that class contains methods

        //Q : What is a wrapper class ?
        // It controls / encapsulates primitive data types , below is example that how can you work with wrapper class by auto boxing and unboxing
        int x = 5; // Primitive

        Integer y = x; // Autoboxing: int to Integer
        //              OR
        //Integer y = 10;

        int z = y; // Unboxing: Integer to int
        System.out.println(z);
    }
}