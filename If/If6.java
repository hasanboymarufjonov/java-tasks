package If;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        int a1, a2;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Sonlarni kiriting: ");
            a1 = input.nextInt();
            a2 = input.nextInt();
        }

        if (a1 > a2) {
            System.out.println(a1);
        }
        if (a2 > a1) {
            System.out.println(a2);
        }

    }
}
