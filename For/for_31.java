package gita.foundation.problems_6;

import java.util.Scanner;

public class for_31 {
    public static void main(String[] args) {
        int n;
        double ak,  an = 2;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (int i = 0; i < n; i++) {

            ak = 2 + (1 / an);

            an = ak;

            System.out.println(ak);
        }
    }
}
