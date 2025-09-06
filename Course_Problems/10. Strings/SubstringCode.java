public class SubstringCode {
    public static String substring(String word, int si, int ei) {
        String subString = "";
        while (si <= ei) {
            subString += word.charAt(si);
            si++;
        }
        return subString;
    }

    public static void main(String[] args) {
        String name = "Hello World!";
        int si = 6;
        int ei = 11;
        System.out.println(substring(name, si, ei));
    }
}