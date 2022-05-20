package If;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        int a1, a2, a3, n;
        Scanner input = new Scanner(System.in);
        n = 0;
        System.out.println("Sonlarni kiriting: ");
        a1 = input.nextInt();
        a2 = input.nextInt();
        a3 = input.nextInt();

        if (a1 > 0) {
            n = n + 1;
        }
        if (a2 > 0) {
            n = n + 1;
        }
        if (a3 > 0) {
            n = n + 1;
        }

        System.out.println(n);

    }
}
