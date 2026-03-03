package OOPS;

public class SingleInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
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
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}