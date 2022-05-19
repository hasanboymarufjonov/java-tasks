package If;

import java.util.Scanner;

public class if_27 {
    public static void main(String[] args) {
        double x;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X = ");
            x = input.nextInt();
        }

        int integer = (int)x;

        if (x < 0) {
            x = 0;
        } else if (integer % 2 == 0) {
            x = 1;
        } else if (integer % 2 == 1) {
            x = -1;
        }

        System.out.println(x);

    }
}
