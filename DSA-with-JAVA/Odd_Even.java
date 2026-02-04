package Conditionals;
import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if(num%2==0){
            System.out.println(num + " is EVEN");
        }
        else{
            System.out.println(num + " is ODD");
        }
    }
}
