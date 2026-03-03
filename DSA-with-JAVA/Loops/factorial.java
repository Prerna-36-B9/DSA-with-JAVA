package Loops;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        // factorial
        System.out.println("CALCULATING THE FACTORIAL OF A NUMBER...");
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // factorial loop
        int i=1;
        int fact=1;
        while(i<=n){
            fact = fact*i;
            i++;
        }

        System.out.println("The factorial of " +n+ " is: " +fact);
    }
}
