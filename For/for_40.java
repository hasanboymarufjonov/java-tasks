package For;

import java.util.Scanner;

public class for_40 {
    public static void main(String[] args) {
        int a, b, s;

        try (Scanner input = new Scanner(System.in)) {
            a = input.nextInt();
            b = input.nextInt();
        }

        for (int i = 0; i < (a - b); i++) {
            for (int j = 0; j < (a - b); j++) {
                s = a + i;
                System.out.println(s);
            }
        }
    }
}
