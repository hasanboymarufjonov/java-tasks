package gita.foundation.problems_4;

import java.util.Scanner;

public class if_15 {
    public static void main(String[] args) {
        int a1, a2, a3;
        Scanner input = new Scanner(System.in);

        System.out.println("Sonlarni kiriting: ");
        a1 = input.nextInt();
        a2 = input.nextInt();
        a3 = input.nextInt();

        if (a1 > a3 && a2 > a3) {
            System.out.println(a1 + a2);
        } else if (a2 > a1 && a3 > a1) {
            System.out.println(a2 + a3);
        } else if (a1 > a2 && a3 > a2) {
            System.out.println(a3);
        }
    }
}
