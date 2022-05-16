package If;

import java.util.Scanner;

public class if_28 {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);

        System.out.print("Yil = ");
        x = input.nextInt();

        if (x % 4 == 0 && x % 100 == 0) {
            if (x % 400 == 0) {
                System.out.println("366");
            } else {
                System.out.println("365");
            }
        } else if (x % 4 == 0 && x % 100 != 0) {
            System.out.println("366");
        } else {
            System.out.println("365");
        }

    }
}
