package Integer;

import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {
        int lsm, lm;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Uzunlikni santimetrda kiriting: ");
            lsm = input.nextInt();
        }
        lm = lsm / 100;

        System.out.println(lsm + " sm to'liq " + lm + " m ga teng");
    }
}
