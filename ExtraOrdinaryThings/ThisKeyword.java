package ExtraOrdinaryThings;

// Object has its own state and behaviour
// Reference var refers the object
// 'this' keyword is also a 'ref var' which refers to current object

class Test{
    int i;
    void setValue(int i){
        // this method has no meaning & it will give us 0
        i = i;
    }
    void show(){
        System.out.println(i);
    }
}

class Tested{
    int i;
    void setValue(int i){
        this.i = i; // 'this' refers to instance var of current object
    }
    void show(){
        System.out.println(i);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Tested one = new Tested();
        one.setValue(7);
        one.show();
    }
}
