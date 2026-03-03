package OOPS;

public class Practice_1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name="Aman"; // this is how we call a class 
        System.out.println(s.name);
    }
}

class Student{
    String name;
    int marks;
}

class Person{    // class Person can access name and weight only
    String name;
    int weight;
}

class Boy extends Person{
    int rollNumber;
    String schoolName;
}

// Which modifiers are not allowed in front of class?? ~~ Answer: private and protected


