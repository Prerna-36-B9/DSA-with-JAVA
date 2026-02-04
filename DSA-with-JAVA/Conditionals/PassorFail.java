package Conditionals;
import java.util.*;
public class PassorFail {
    public static void main(String[] args) {
        System.out.print("Enter your marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();

        String Result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println("Your result is: " + Result);
    }
    
}
