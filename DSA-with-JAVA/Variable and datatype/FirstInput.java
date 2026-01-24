import java.util.*;
public class FirstInput {
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name + ", welcome to Java programming!");
        sc.close();
    }
}