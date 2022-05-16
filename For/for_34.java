package For;

import java.util.Scanner;

public class for_34 {
    public static void main(String[] args) {
        int n;
        double a1 = 1, a2 = 2, ak;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (int i = 3; i < n; i++) {

            ak = (a2 + 2 * a1) / 3;

            a1 = a2;
            a2 = ak;

            System.out.println(ak);
        }
    }
}
