package If;

import java.util.Scanner;

public class if_1 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("Sonni kiriting: ");
        a = input.nextInt();

        a = a > 0 ? a + 1 : a;

        System.out.println(a);
    }
}
