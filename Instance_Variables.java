public class Instance_Variables {

    int myVariable = 10; // this is instance variable stored in heap memory

    void sum() {    // simple method
        int a = myVariable + 10; // here we use instance variable
        System.out.println(a);
    }

    static void mutliply() {    // static method
        Instance_Variables one = new Instance_Variables();
        int b = one.myVariable * 10;
        System.out.println(b);
    }

    public static void main(String[] args) {
        Instance_Variables one = new Instance_Variables();
        one.sum();
        mutliply();
    }
}
