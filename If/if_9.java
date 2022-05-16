package If;

import java.util.Scanner;

public class if_9 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Sonlarni kiriting: ");
        a = input.nextInt();
        b = input.nextInt();

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println(a + " va " + b);
        } else if (b > a) {
            System.out.println(a + " va " + b);
        }
    }
}
