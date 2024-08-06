public class Static_Variables {
    static int variable = 10;   // this is static variable

    void numberWas() {
        int a = variable * 2;  // we can use static variable like this
        System.out.println(a);
    }

    static void numberIs() {
        int b = variable * 10;
        System.out.println(b);
    }

    public static void main(String[] args) {
        Static_Variables one = new Static_Variables();
        System.out.println(variable);   // we can directly access the static variable
        one.numberWas();
        numberIs();
    }
}
