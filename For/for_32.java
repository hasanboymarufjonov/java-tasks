package For;

import java.util.Scanner;

public class for_32 {
    public static void main(String[] args) {
        int n;
        double ak, an = 1;

        try (Scanner input = new Scanner(System.in)) {
            n = input.nextInt();
        }

        for (int i = 0; i < n; i++) {

            ak = (an + 1) / i;

            an = ak;

            System.out.println(ak);
        }
    }
}
