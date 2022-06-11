package Exam1;

import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Katta aylana radiusini kiriting = ");
        int r1 = input.nextInt();

        System.out.print("Kichkina aylana radiusini kiriting = ");
        int r2 = input.nextInt();

        double s3 = 3.14 * (r1 - r2);

        System.out.printf("Yuzalar ayirmasi = %.2f", s3);
    }
}
