public class Non_Primitives {
    public static void main(String[] args) {
        // Q : Is there any fixed size of non primitives in data_types ?
        // We know size of non primitives are immutable / volatile which means they can contain any size but that doesn't mean we have no value
        // Thus size is calculated at run time and memory is allocated
        // Fun Fact : Sometimes primitives are helpful to allocate the memory at run time

        char a = 'f';
        System.out.println("Character size of a is : " + (Character.SIZE / Byte.SIZE) ); // prints character size in bytes which is 2

        String name = "Flux";
        System.out.println("String size of name is : " + name.length() * ( Character.SIZE / Byte.SIZE ) );   // prints String size in bytes which is char bytes * String size

        int b = 10;
        System.out.println("Integer size of b is : " + ( Integer.SIZE / Byte.SIZE) );   // prints character size in bytes which is 2

        int [] num = new int[3];
        System.out.println("Array size of num is : " + num.length * ( Integer.SIZE / Byte.SIZE ) );     // prints String size in bytes which is char bytes * String size
    }
}
