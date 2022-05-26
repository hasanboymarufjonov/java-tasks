package Case;

import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b;
        System.out.print("A = ");
        a = input.nextInt();
        System.out.print("B = ");
        b = input.nextInt();
        System.out.println("Operations (1: +, 2: -, 3: /, 4: *");
        int operation = input.nextInt();

        switch (operation) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a / b);
            case 4 -> System.out.println(a * b);
            default -> System.out.println("Error");
        }
    }
}
