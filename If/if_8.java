package gita.foundation.problems_4;

import java.util.Scanner;

public class if_8 {
    public static void main(String[] args) {
        int a1, a2;
        Scanner input = new Scanner(System.in);

        System.out.println("Sonlarni kiriting: ");
        a1 = input.nextInt();
        a2 = input.nextInt();

        if (a1 > a2) {
            System.out.println(a1 + " va " + a2);
        } else {
            System.out.println(a2 + " va " + a1);
        }
    }
}
