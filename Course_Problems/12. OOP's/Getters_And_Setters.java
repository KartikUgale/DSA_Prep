public class Getters_And_Setters {
    public static void main(String[] args) {
        Pen m1 = new Pen();

        m1.setColor("Red");
        System.out.println(m1.getColor());

        m1.setTip(2);
        System.out.println(m1.getTip() + " mm");
    }
}

class Pen {
    private String color;
    public int tip;

    String getColor() { // Getter
        return this.color;
    }

    int getTip() { // Getter
        return this.tip;
    }

    void setColor(String color) { // Setter
        this.color = color;
    }

    void setTip(int tip) { // Setter
        this.tip = tip;
    }
}
