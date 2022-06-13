package Minmax;

import java.util.Scanner;

public class Minmax29 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("n = ");
            int n = input.nextInt();
            int count = 1;
            System.out.print("1 = ");
            int a = input.nextInt();
            for (int i = 2; i <= n; i++) {
                System.out.print(i + " = ");
                int an = input.nextInt();
                if (a == an)
                    count++;
                else if (a > an) {
                    a = an;
                    count = 1;
                }
            }
            System.out.println("Eng kichik elementlar soni = " + count);
        }
    }
}
