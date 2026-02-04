package Conditionals;
import java.util.*;
public class Else_If {
    public static void main(String[] args) {
        System.out.print("Enter your marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();

        if(marks >= 80){
            System.out.println("Grade A");
        }
        else if(marks >= 70){
            System.out.println("Grade B");
        }
        else if(marks >= 55){
            System.out.println("Grade C");
        }
        else if(marks >= 35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
