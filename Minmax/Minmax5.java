package Minmax;

import java.util.Scanner;

public class Minmax5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int N = input.nextInt();

        int maxro = N;

        for (int i = 2; i < n; i++) {
            int m = input.nextInt();
            int v = input.nextInt();
            double ro = m / v;

            if (ro > N) {
                maxro = N;
            }
        }
    }
}
