package If;

import java.util.Scanner;

public class IfAdd4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a > b && b > c) {
                System.out.println("a > b > c tengsizlikni qanoatlantiradi");
            } else {
                System.out.println("a > b > c tengsizlikni qanoatlantirmaydi");
            }
        }
    }

}
