package Integer;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {
        int a, b, n, c;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("A kesma uzunligini kiriting: ");
            a = input.nextInt();
            System.out.println("B kesma uzunligini kiriting: ");
            b = input.nextInt();
        }
        n = a / b;
        c = a - n * b;

        System.out.println(
                a + " kesma ichiga " + b + " kesmadan " + n + " ta joylashtirish mumkin va " + c + " joy ortib qoladi");
    }
}
