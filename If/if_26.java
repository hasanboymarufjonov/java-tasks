package If;

import java.util.Scanner;

public class if_26 {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);

        System.out.print("X = ");
        x = input.nextInt();

        if (x <= 0) {
            x = -x;
        } else if (x > 0 && x < 2) {
            x = x * x;
        } else if (x >= 2) {
            x = 4;
        }

        System.out.println(x);

    }
}
