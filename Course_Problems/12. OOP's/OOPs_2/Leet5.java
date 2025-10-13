public class Leet5 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        int start = 0;
        int end = 0;
        int palindromeLength = 0;

        for (int i=0; i<s.length()-1; i++) {
            for (int j=i+1; j<s.length(); j++) {
                String subStr = s.substring(i, j+1);
                int subStrLength = (j+1)-i;
                //System.out.println(subStr+","+subStrLength+", ans= "+sb.substring(start, end));
                if (subStrLength > palindromeLength & palindrome(subStr)) {
                    start = i;
                    end = j+1;
                    palindromeLength = subStrLength;
                }
            }
        }
        return s.substring(start, end);
    }

    public static boolean palindrome(String s) {
        int i=0, j= s.length()-1;
        while (i<=j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
