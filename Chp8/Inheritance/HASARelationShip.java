package Chp8.Inheritance;
class Student{
    String name;
    int roll;
}
// Association (HAS-A) relationShip
// 1. Student HAS-A name
// 1. Student HAS-A roll

class Engine{
    int hp = 1000;
}

class Car extends Engine{
    int carsHp = hp + 50;
}

class Tractor extends Engine{
    int TractorsHP = hp + 150;
}


// Car HAS-A Engine

public class HASARelationShip {
    // This is also called as Association
    // This type of relationShip is not tightly couple i.e ( Car doesn't care if changes are made in Engine )
}
