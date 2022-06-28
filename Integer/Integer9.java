package Integer;

import java.util.Scanner;

public class Integer9 {
    public static void main(String[] args) {
        int a, a1;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Uch xonali son kiriting: ");
            a = input.nextInt();
        }
        a1 = a / 100;

        System.out.println(a + " ning yuzlar xonasidagi birinchi raqami " + a1 + " ga teng");
    }
}
