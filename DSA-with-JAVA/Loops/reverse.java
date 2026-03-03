package Loops;

public class reverse {
    public static void main(String[] args) {
        int n=129;
        int rev=0;
        int rem = 0;
        while(n>0){
            rem = n%10;  // get last digit
            rev= rev*10+rem;  // get reversed digit
            n=n/10;  //make the number n, 1 smaller
        }
        System.out.println("Reverse of the given number is: " + rev);
    }
}
