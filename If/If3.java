package If;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("Sonni kiriting: ");
        a = input.nextInt();

        if (a > 0) {
            a = a + 1;
        } else if (a < 0) {
            a = a - 2;
        } else {
            a = 10;
        }

        System.out.println(a);
    }
}
