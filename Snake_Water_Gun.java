package Mini_Projects;

import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class Snake_Water_Gun{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> map = new HashMap<>();

        char[] options = {'w', 's', 'g'};
        map.put('w', "Water");
        map.put('g',"Gun");
        map.put('s',"Snake");
        // Random random = new Random();
        char computerChose = options[new Random().nextInt(options.length)];

        System.out.print("Enter Your Choice (s,g,w) : ");
        char youChose = sc.next().charAt(0);

        System.out.println(" Computer Chose : "+map.get(computerChose)+"\n You Chose : "+map.get(youChose));

        if (computerChose == youChose) {
            System.out.println("Drow!");
        } else {
            if (computerChose == 'g' && youChose == 'w') {
                System.out.println("You Win!");
            } else if (computerChose == 'g' && youChose == 's') {
                System.out.println("You Lose!");
            } else if (computerChose == 'w' && youChose == 's') {
                System.out.println("You Win!");
            } else if (computerChose == 'w' && youChose == 'g') {
                System.out.println("You Lose!");
            } else if (computerChose == 'g' && youChose == 's') {
                System.out.println("You Lose!");
            } else if (computerChose == 'g' && youChose == 'w') {
                System.out.println("You Win!");
            } else {
                System.out.println("Something went Wrong!");
            }
        }
    }
}