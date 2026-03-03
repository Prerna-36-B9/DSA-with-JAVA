package Loops;
import java.util.Scanner;
public class sum_n {
    public static void main(String[] args) {
        // print the sum of n natural numbers
        System.out.println("SUM OF 'n' NATURAL NUMBERS...");
        System.out.print("Value pf n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int i=1;
        while (i<=n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of " + n+ " natural numbers: " + sum);
    }
}
