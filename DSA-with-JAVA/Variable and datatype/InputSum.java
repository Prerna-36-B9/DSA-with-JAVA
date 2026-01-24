import java.util.*;

public class InputSum {
    public static void main(String[] args) {
        System.out.print("Enter the 1st number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        sc.close();
    }
}
