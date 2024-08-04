public class Local_Variables {
    void multiply() {   // this is method

        // access modifies cannot be used in local variables eg : public int local Variable
        int a = 20 , d; // 'a' & 'd' are local variables which cannot be used outside the method
        d = a;
        System.out.println(d);
        // Q : What if local variable is not set any value
        // It will throw an error because local variables don't have default values

    }// method ends here

    // local variable 'a' and 'd' gets destroyed outside the method


    public static void main(String[] args) {

        Local_Variables one = new Local_Variables();
        one.multiply(); // calling our method

    }
}
