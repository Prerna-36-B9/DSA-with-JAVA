import java.util.*;
public class CircleArea {
    public static void main(String[] args) {
        System.out.print("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;  // in java 3.14 is considered as double... NOTE: 👉 All decimal numbers are double by default in JAVA... By adding f in 3.14 we tell java that 3.14 is a float!!
        System.out.println("Area of circle of radius " + radius + " is: " + area);
        sc.close();
    }
}
