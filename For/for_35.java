package F;

import java.util.Scanner;

public class for_35 {
    public static void main(String[] args) {
        int n;
        double a1 = 1, a2 = 1, a3 = 3, ak;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (int i = 4; i < n; i++) {

            ak = a1 + a2 - 2 * a3;

            a1 = a2;
            a2 = a3;
            a3 = ak;

            System.out.println(ak);
        }
    }
}
