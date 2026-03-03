package Loops;
import java.util.Scanner;
public class outTill10 {
    public static void main(String[] args) {
        do {
            System.out.print("Enter numbers: ");
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            if(n%10==0){
                break;
            }
        }
        while(true);
        System.out.println("Out of the loop");
    }
}
