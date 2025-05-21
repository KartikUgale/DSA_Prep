public class stringBuilderCode {
    public static void main(String[] args) {
        String str = "char ";
        StringBuilder sb = new StringBuilder(str);
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb); // print abcde...z
        System.out.println(sb.length());

    }
}
