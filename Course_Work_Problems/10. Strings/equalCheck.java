public class equalCheck {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("Equal"); // because of same location
        } else {
            System.out.println("Not Equal");
        }

        if (s1 == s3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal"); // because of new String
        }

        if (s1.equals(s3)) {
            System.out.println("Equal"); // beacse of using .equal() hence it compare stored data
        } else {
            System.out.println("Not Equal");
        }
    }
}
