package Integer;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, n1, n2, n, s;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        n1 = a / c;
        n2 = b / c;
        n = n1 * n2;
        s = a * b - c * c * n;

        System.out.println(n + " ta kvadrat, " + s + " ortib qolgan yuza");
    }
}
