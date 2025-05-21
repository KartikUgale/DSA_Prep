public class directionsQue {
    public static void direction(String word) {
        int x = 0, y = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'W') {
                x--;
            } else if (word.charAt(i) == 'E') {
                x++;
            } else if (word.charAt(i) == 'N') {
                y++;
            } else if (word.charAt(i) == 'S') {
                y--;
            }
        }
        System.out.println("Final Location:- (" + x + "," + y + ")");
        float X = (float) Math.pow(x, 2);
        float Y = (float) Math.pow(y, 2);
        System.out.println("Smallest Displacement:- " + (Math.sqrt(X + Y)));
    }

    public static void main(String[] args) {
        String data = "WNEENESENNN";
        direction(data);
    }
}
