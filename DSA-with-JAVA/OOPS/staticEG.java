package OOPS;

public class staticEG {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname="DAV";

        Student s2 = new Student();
        System.out.println("Name of the school: " + s2.schoolname); //since schoolname is static variable, it is shared by all the objects of the class, so we can access it using any object of the class. 
        
    }
    
}

class Student{
    String name;
    int roll;

    static String schoolname;

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }
}