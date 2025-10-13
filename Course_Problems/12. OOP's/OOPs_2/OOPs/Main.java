package OOPs;

public class Main {
    public static void main (String[] args) {
        for (String arg : args) {
            System.out.print(arg + " ");
        }

        int num = 10;
        label01 :
        for (int i=0; i<num; i++) {
            for (int j = 0; j <5; j++) {
                if (j == 3) break label01;
                System.out.print(j+" ");
            }
            System.out.println();
        }


        int num1;
        do {
            num1 = (int)(Math.random()*11+90);
            System.out.println(num1);

            if (num1 == 100) {
                break;
            }
        } while (true);


        System.out.println(Math.floor(3.2));    // 3.0  (Closest lower)
        System.out.println(Math.ceil(3.2));     // 4.0  (Closest upper)

        System.out.println(Math.round(5.4));    // roundup
        System.out.println(Math.round(5.8));
        System.out.println(Math.round(5.5));


    }
}