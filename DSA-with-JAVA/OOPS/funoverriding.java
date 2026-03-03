package OOPS;

public class funoverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats");
    }
}

class Deer{
    void eat(){  // here overriding is performed
        System.out.println("eat grass");
    }
}
