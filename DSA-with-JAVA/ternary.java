package Conditionals;
import java.util.*;
public class ternary {
    //Going to check if the number is odd or even using ternary operator
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }
}
