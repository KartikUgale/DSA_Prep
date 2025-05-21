public class Multiple_Interfaces {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatGrass();
        b.eatFish();
    }
}

interface Veg {
    void eatGrass();
}

interface NonVeg {
    void eatFish();
}

class Bear implements Veg, NonVeg {
    public void eatGrass() {
        System.out.println("veg");
    }

    public void eatFish() {
        System.out.println("Non veg");
    }
}
