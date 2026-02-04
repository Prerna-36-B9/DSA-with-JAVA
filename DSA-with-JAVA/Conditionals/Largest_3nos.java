package Conditionals;
import java.util.*;
public class Largest_3nos {
    public static void main(String[] args) {
        System.out.print("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a>=b && a>=c){
            System.out.println(a + " is the largest number");
        }
        else if(b>=c){
            System.out.println(b + " is the largest number");
        }
        else{
            System.out.println(c + " is the largest number"); 
        }
    }
}
