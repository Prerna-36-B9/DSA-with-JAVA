package OOPS;

public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prerna";
        s1.roll = 123;
        s1.password = "abc";
        s1.marks [0] = 100;
        s1.marks [1] = 90;
        s1.marks [2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
        for (int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[]=new int[3];  // array declearation in java

    //copy constructor
    Student(Student s){
        this.name = s.name;
        this.roll = s.roll;
        this.marks = s.marks;
    }

    // non parameterized constructor or default constructor
    Student(){
        System.out.println("This is the Student Constructor.");
    }

    // parameterized constructor
    Student(String name){
        this.name = name;
    }

    // parameterized constructor
    Student(int roll){
        this.roll = roll;
    }

    Student(int marks[]){
        marks = new int[3];
    }
}