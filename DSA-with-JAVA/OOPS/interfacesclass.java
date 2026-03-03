package OOPS;

public class interfacesclass {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

// this is the interface class which is by default public, abstract and takes no implementation
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){    // here we have to make the fuction moves as public cause if we don't write anything that it is default which is not same as interface class (interface class is public)
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - (by step 1)");
    }
}
