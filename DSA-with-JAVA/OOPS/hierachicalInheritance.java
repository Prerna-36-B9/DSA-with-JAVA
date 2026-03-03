package OOPS;

public class hierachicalInheritance {
    public static void main(String[] args) {
        Bird B = new Bird();
        B.fly();
        B.breath();
        B.color = "Redish Brown";
        System.out.println(B.color);
    }
}

// base class
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}

// 1st derived class with the parent class Animal
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

// 2nd dervied class with the parent class Animal
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

//3rd derived class with the parent class Animal
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
