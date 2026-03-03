package OOPS;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Prerna"); // parameterized constructor
        Student s2 = new Student(123); // parameterized constructor
        Student s3 = new Student();  // default or non parameterized constructor
        System.out.println(s1.name);
        System.out.println(s2.roll);
        System.out.println(s3.name); // null because we have not assigned any value to name in default constructor
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("This is the Student Constructor.");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}