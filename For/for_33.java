package For;

import java.util.Scanner;

public class for_33 {
    public static void main(String[] args) {
        int n;
        double f1 = 1, f2 = 1, fk;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (int i = 3; i < n; i++) {

            fk = f1 + f2;

            f1 = f2;
            f2 = fk;

            System.out.println(fk);
        }
    }
}
