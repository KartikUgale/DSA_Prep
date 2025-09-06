public class Update_ithPosBit { // approach 2
    public static int clear_itBit(int num, int i) { // 3rd Method
        int bitMask = ~(1 << i);
        return (bitMask & num);
    }

    public static int Update_ithBit(int num, int i, int newBit) { // 2nd Method
        num = clear_itBit(num, i); // ---->to 3rd method
        int bitMask = newBit << i;
        return (bitMask | num); // ---->to main method
    }

    public static void main(String[] args) { // main method
        System.out.println(Update_ithBit(10, 2, 1)); // ---->to 2nd Method
    }
}
