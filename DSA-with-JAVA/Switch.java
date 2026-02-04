package Conditionals;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        System.out.print("Enter a number (1-7) for the day of the week: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
    }
    
}
