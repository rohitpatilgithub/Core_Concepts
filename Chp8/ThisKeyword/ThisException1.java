package Chp8.ThisKeyword;

class Pupil{

    // 1. 'this' keyword is used to invoke current class instance var

    private long phone;
    void givePhone(long phone){
        this.phone = phone; // 'this' invokes instance 'phone'
    }
    void show(){
        System.out.println(phone);
    }
}

public class ThisException1 {
    public static void main(String[] args) {
        Pupil one = new Pupil();
        one.givePhone(9865320147L);
        one.show();
    }
}
