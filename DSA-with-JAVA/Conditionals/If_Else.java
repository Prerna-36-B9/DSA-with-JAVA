package Conditionals;

import java.util.*;
public class If_Else {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        if(age >= 18){
            System.out.println("ADULT\nCAN VOTE\nCAN DRIVE");
        }
        if((age > 13) && (age < 18)){
            System.out.println("TEENAGER");
        }
        else{
            System.out.println("NOT ADULT");
        }
    }
}
