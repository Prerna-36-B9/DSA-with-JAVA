package OOPS;

public class Lecture_01 {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(2.5);
        System.out.println(p1.getTip());

        Student s1 = new Student(); // created a student object called s1
        s1.calcPercentage(89,79, 92);
        System.out.println(s1.percentage);

        BankAccount MyAcc = new BankAccount();
        MyAcc.username = "Prerna";
        System.out.println(MyAcc.username);
        MyAcc.setPassword("abcd1234@"); // we can only set the password can;t display it cause it has the access modifier as PRIVATE
    }
}

class Pen{
    // These are the 2 attributes
    private String color;
    private double tip;

    // These are the 2 funtions

    void setColor(String newColor){   // This is a setter function
        color = newColor;
    }

    String getColor(){  // This is a getter
        return this.color;
    }

    void setTip(double newTip){   // This is also a setter function
        tip = newTip;
    }

    double getTip(){  // This is a getter
        return this.tip;
    }
}

class Student{
    // Attributes
    String Student_name;
    int Roll_no;
    float percentage;

    // Functions
    void calcPercentage(int phy, int chem, int math){
        percentage = (math+chem+phy)/3;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
