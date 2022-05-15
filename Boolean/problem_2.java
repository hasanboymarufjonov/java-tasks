package Boolean;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Sonlarni kiriting: ");
        a = input.nextInt();
        b = input.nextInt();
        boolean result;
        result = Math.abs(a + b) < (Math.abs(a) + Math.abs(b));
        System.out.println(result);
    }
}
