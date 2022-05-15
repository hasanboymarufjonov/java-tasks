package For;

import java.util.Scanner;

public class for_39 {
    public static void main(String[] args) {
        int a, b, s;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();

        for (int i = 0; i < (a - b); i++) {
            for (int j = 0; j < i; j++) {
                s = a + i;
                System.out.println(s);
            }
        }
    }
}
