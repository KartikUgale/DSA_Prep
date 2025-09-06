public class Interfaces {
    public static void main(String[] args) {
        King k = new King();
        k.moves();
    }
}

interface Chess { // whole class with its all methods behave like 100% Abstraction. (is a
                  // blueprint of Chess)
    void moves(); // All functions created in interface are mandatory to used in it's Child
                  // classes.
}

class King implements Chess {
    public void moves() {
        System.out.println("Move in all directions by 1 step");
    }
}

class Pawn implements Chess {
    public void moves() {
        System.out.println("Move up, down, left, right by 1 step");
    }
}