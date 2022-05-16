package For;

import java.util.Scanner;

public class for_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();

        double c = 0;
        for (double i = 0; i <= n; i++) {
            c += Math.pow(n + i, 2);
        }
        System.out.println(c);
    }
}
