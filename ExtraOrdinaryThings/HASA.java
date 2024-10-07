package ExtraOrdinaryThings;

// Here we will learn about HAS-A relationship
// We have a package called ExtraOrdinaryThings
// Here We can use Vehicle class and its properties from other file
// This makes the relationship loosely coupled

interface Fruit {
    abstract void squeeze();
}

class Juice implements Fruit {
    @Override
    public void squeeze() {
        System.out.println();
    }
}

class Duster {
    private Vehicle two;
    void displayDuster() {
        System.out.println(two.name);
    }
}

public class HASA {
    public static void main(String[] args) {
        Duster one = new Duster();
        one.displayDuster();
    }
}
