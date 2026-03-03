package OOPS;

public class Abstractionclass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); // brown because we have assigned value to color in constructor of abstract class
        h.changeColor();
        System.out.println(h.color +'\n'); // black or dark brown because we have assigned value to color in changeColor method of Horse class

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

// abstract class cannot be instantiated, it can only be inherited by other classes
// abstract class can have both abstract and non-abstract methods
//abstract class can have constructors and static methods as well, but it cannot be instantiated
// This is an abstract class
abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }

    // constructor of abstract class
    String color;
    Animal(){
        color = "brown";
    }

    // abstract method
    abstract void walk();   // abstract method is a method that is declared without an implementation, it must be implemented by the subclass
}

class Horse extends Animal{
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
    void changeColor(){
        color = "black or dark brown";
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("chicken walks on 2 legs");
    }
    void changeColor(){
        color = "yellow or white";
    }
}
