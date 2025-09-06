public class StringCompressionQue {
    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder("");
        Integer count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1));
        sb.append(count);
        return sb.toString();
    }

    public static void main(String args[]) {
        String str1 = "aaabbbccggggsssqqqqq";
        System.out.println(compressString(str1));
    }
}
