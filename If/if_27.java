package If;

import java.util.Scanner;

public class if_27 {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);

        System.out.print("X = ");
        x = input.nextInt();

        if (x < 0) {
            x = 0;
        } else if (x % 2 == 0) {
            x = 1;
        } else if (x % 2 == 1) {
            x = -1;
        }

        System.out.println(x);

    }
}
