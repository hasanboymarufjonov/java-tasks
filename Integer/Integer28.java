package Integer;

import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        // 0 - yakshanba, 1 - dushanba, 2 - seshanba, 3 - chorshanba, 4 - payshanba, 5 -
        // juma, 6 - shanba;
        int n, k, w;
        Scanner input = new Scanner(System.in);
        System.out.println("Kunni kiriting: ");
        k = input.nextInt();
        System.out.println("Yil qaysi kundan boshlanadi?");
        System.out.println("yakshanba: -1, dushanba: 0, seshanba: 1, chorshanba: 2, payshanba: 3, juma: 4, shanba: 5");
        w = input.nextInt();
        n = (k + w) % 7;

        System.out.println("Kiritilgan " + k + " chi kun haftaning " + n + " chi kuni");
        System.out.println(
                "0 - yakshanba, 1 - dushanba, 2 - seshanba, 3 - chorshanba, 4 - payshanba, 5 - juma, 6 - shanba");

    }
}
