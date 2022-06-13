package Minmax;

import java.util.Scanner;

public class Minmax21 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("n = ");
            int n = input.nextInt();
            int count = 1, count2 = 1;
            System.out.print("1 = ");
            int a = input.nextInt();

            int a1 = a;
            int a2 = a;

            int sum1 = 0, sum2 = 0, sum = 0;
            for (int i = 2; i <= n; i++) {
                System.out.print(i + " = ");
                int an = input.nextInt();
                if (a1 == an) {
                    count++;
                    sum1 += an;
                } else if (a1 > an) {
                    a1 = an;
                    count = 1;
                    sum1 = 0;
                }

                if (a2 == an) {
                    count2++;
                    sum2 += an;
                } else if (a2 < an) {
                    a2 = an;
                    count2 = 1;
                    sum2 = 0;
                }

                sum += an;

            }
            System.out.println("Eng kichik elementlar soni = " + count);
            System.out.println("Eng katta elementlar soni = " + count2);
            System.out.println("Exterimal elementlar soni = " + (count + count2));

            System.out.println(sum1);
            System.out.println(sum2);
            System.out.println(sum);

            System.out.println((sum - sum1 - sum2) / (n - count - count2));

        }
    }
}
