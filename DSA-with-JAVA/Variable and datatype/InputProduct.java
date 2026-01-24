import java.util.*;

public class InputProduct {
    public static void main(String[] args) {
        System.out.print("Enter the 1st number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        sc.close();
    }
}
