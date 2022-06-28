package Integer;

import java.util.Scanner;

public class Integer6 {
    public static void main(String[] args) {
        int a, a1, a2;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ikki xonali son kiriting: ");
            a = input.nextInt();
        }
        a1 = a / 10;
        a2 = a % 10;

        System.out.println(
                a + " sonining 10 lar xonasidagi raqami " + a1 + " ga, 1 lar xonasidagi raqami esa " + a2 + " ga teng");
    }
}
