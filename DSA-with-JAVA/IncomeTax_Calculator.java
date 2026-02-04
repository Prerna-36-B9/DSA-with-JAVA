package Conditionals;
import java.util.*;
public class IncomeTax_Calculator {
    public static void main(String[] args) {
        System.out.print("Enter your income: ");
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        sc.close();

        if (income < 500000){
            System.out.println("No tax");
            System.out.println("Net income after tax: " + income);
        }
        else if (income >= 500000 && income < 1000000){
            double tax = 0.2 * (income - 500000);
            System.out.println("Your income tax is: " + tax);
            System.out.println("Net income after tax: " + (income - tax));
        }
        else{
            double tax = 0.3 * (income - 1000000) + 100000; // 100000 is tax for first 5 lakhs (20% of 5 lakhs)
            System.out.println("Your income tax is: " + tax);
            System.out.println("Net income after tax: " + (income - tax));
        }
    }
}
