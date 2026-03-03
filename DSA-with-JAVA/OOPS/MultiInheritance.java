package OOPS;

public class MultiInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.legs = 4;
        dobby.eat();
        dobby.breed = "Chihuahua";
        System.out.println(dobby.legs);
        System.out.println(dobby.breed);
    }
}

// Base class or Parent class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}

// Derived class or Child class
class Mammal extends Animal{
    int legs;
}

// Derived class
class Dog extends Mammal{
    String breed;
}

