package If;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        int a;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Sonni kiriting: ");
            a = input.nextInt();
        }

        a = a > 0 ? a + 1 : a - 2;

        System.out.println(a);
    }
}
