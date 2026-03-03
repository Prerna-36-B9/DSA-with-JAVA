package OOPS;

public class superKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println("Color of horse: " + h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}
