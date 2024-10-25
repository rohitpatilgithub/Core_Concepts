package Chp8.StaticKeyword;

// 'static' keyword is non - access modifier
// 1. Can be used for variable ( not with local )
// 2. Can be used for methods
// 3. Can be used on blocks
// 4. inner class ( nested class ) not with outer class
// 5. It gets memory while in class / class loading

class Deer{
    static int a = 10;
}

class Employee{

    static String companyName = "PH";
    // 'PH' company is stored in Method area / class area where
    // all obj of class Employee can access
    static int empId = 0;
    // here we are using emp Id as static cuz it will increment are obj is created

    Employee(String name){
        empId++;
        System.out.println("Employee ID : "+empId+" "+name+" in company "+companyName);
    }

}

public class StaticCar {
    public static void main(String[] args) {
        System.out.println("Accessing instance variable without creating Object : "+Deer.a);
        Employee e1 = new Employee("Sick");
        Employee e2 = new Employee("Duck");
    }
}