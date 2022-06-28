package Exam1;

import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("To'plam o'lchamini kiriting: ");
            int n = scanner.nextInt();
            int count = 1;
            System.out.println("Elementlarni kiriting: ");
            int a = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int an = scanner.nextInt();
                if (a == an)
                    count++;
                else if (a > an) {
                    a = an;
                    count = 1;
                }
            }
            System.out.println("Natija : " + count);
        }
    }
}
