package If;

import java.util.Scanner;

public class if_18 {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Sonlarni kiriting: ");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
        }

        if (a != b) {
            if (b == c) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        } else {
            System.out.println("3");
        }
    }
}
