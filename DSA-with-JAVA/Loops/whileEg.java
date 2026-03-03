package Loops;

public class whileEg {
    public static void main(String[] args) {
        int counter = 1;
        while(counter <= 100){
            System.out.println("Hello World");
            counter++;
        }
        System.out.println(counter); // 101 because after the last iteration, counter is incremented to 101 and then the loop condition is checked, which fails and the loop terminates.
    }
}
