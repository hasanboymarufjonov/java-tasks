package For;

import java.util.Scanner;

public class for_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, sum = 0;

        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int d = 1;
            d++;
            for (int j = 0; j < i; j++) {
                d *= i;
            }
            sum += d;

        }
        System.out.println(sum);

    }
}
