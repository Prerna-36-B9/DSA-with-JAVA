package Operators;

public class Binary {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // this gives only quotient without decimat value (just integer)
        System.out.println((double)a/b); // here we convert one of either a or b into double [we performed type promotion] and the whole expression is converted into double giving an acurate answer!
        System.out.println(a%b);
    }
}
