package If;

import java.util.Scanner;

public class if_11 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Sonlarni kiriting: ");
        a = input.nextInt();
        b = input.nextInt();

        if (a > b) {
            b = a;
            System.out.println("a = " + a);
            System.out.println("b = " + b);

        } else if (b > a) {
            a = b;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        } else if (a == b) {
            a = 0;
            b = 0;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
