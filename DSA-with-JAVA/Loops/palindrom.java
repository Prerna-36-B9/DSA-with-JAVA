package Loops;
import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int num=n;
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }

        if(num==rev){
            System.err.println(num+" is a palindrom.");
        }

        else{
            System.err.println(num+ " is not a palindrom.");
        }
    }
}
