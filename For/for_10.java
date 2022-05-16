package For;

import java.util.Scanner;

public class for_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();

        double c = 0;
        for (double i = 1; i <= n; i++) {
            c += 1 / i;
        }
        System.out.println(c);
    }
}
