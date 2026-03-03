package Loops;
import java.util.Scanner;
public class primeornot {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if (num%i ==0){
                isPrime=false;
            }
        }

        if (isPrime){
            System.out.println(num+ " is a prime number.");
        }
        else{
            System.out.println(num+ " is not a prime number.");
        }

    }
}
