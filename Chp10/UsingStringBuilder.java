package Chp10;

public class UsingStringBuilder {
    public static void main(String[] args) {

        // StringBuilder introduced in 1.5v is same as StringBuffer
        // Difference is that it has non synchronized which makes system performance faster
        // It is mutable like StringBuffer

        StringBuilder sc = new StringBuilder("one");
    }
}
