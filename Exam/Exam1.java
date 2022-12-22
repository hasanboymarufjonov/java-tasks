// 20
package Exam;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of elements = ");
        int n = input.nextInt();
        System.out.println("Enter elements: ");
        int min1 = input.nextInt();
        int min2 = input.nextInt();

        for (int i = 3; i <= n; i++) {
            int num = input.nextInt();
            if (min2 > num) {

                int t = min2;
                min2 = num;
                num = t;
            }

            if (min1 > num)
                min1 = num;
        }
        System.out.println("Minimal numbers: ");
        System.out.println(min1);
        System.out.println(min2);

    }
}
