package OOPS;

public class funoverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Required sum = " + cal.sum(3,5));
        System.out.println("Required sum = " + cal.sum(3.6,5.6));
        System.out.println("Required sum = " + cal.sum((float)3.7,(float)5.34));
        System.out.println("Required sum = " + cal.sum(3,5, 9));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    double sum(double a, double b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}