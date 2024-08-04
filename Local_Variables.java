public class Local_Variables {
    void multiply() {

        // access modifies cannot be used in local variables eg : public int local Variable
        int a = 20 , d; // 'a' is local variable which cannot be used outside the method
        d = a;
        System.out.println(d);
        // Q : What if local variable is not set any value
        // It will throw an error because local variables don't have default values

    }

    // localVariable gets destroyed outside the method


    public static void main(String[] args) {

        Local_Variables one = new Local_Variables();
        one.multiply();

    }
}
