package Operators;

public class Unary {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // Pre-increment: firstly the value of a is increased and then the increased value is store in b
        System.out.println(a); // output = 11
        System.out.println(b); // output = 11

        int d = 10;
        int c = d++; // Post-increment: firstly the value of d is assigned to c then it is increased
        System.out.println(d); // output: 11
        System.out.println(c); // output: 10


        int x = 10;
        int y = --x; // Pre-decrement: firstly the value of x is decreased and then the decreased value is store in y
        System.out.println(x); // output: 9
        System.out.println(y); // output: 9

        int p = 10;
        int q = p--; // Post-decrement: firstly the value of p is assigned to q then it is decreased
        System.out.println(p); // output: 9
        System.out.println(q); // output: 10
        
    }
}