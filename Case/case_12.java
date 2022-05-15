package gita.foundation.problems_5;



import java.util.Scanner;

public class case_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14, value;
        System.out.println("Kiritiladigan elementni tanlang(1: radius, 2: diametr, 3: uzunlik, 4: yuza): ");
        int type = input.nextInt();
        System.out.println("Qiymatni kiriting");
        value = input.nextInt();
/*
        s = pi * r * r;
        l = 2 * pi * r;
        d = 2 * r;
*/
        switch (type) {
            case 1 -> System.out.println("S = " + pi * value * value + " D = " + 2 * value + " L = " + 2 * pi * value);
            case 2 -> System.out.println("S = " + pi * (value / 2) * (value / 2) + " R = " + value / 2 + " L = " + pi * value);
            case 3 -> System.out.println("S = " + pi * (value / 2 / pi ) * (value / 2 / pi) + " D = " + value / pi + " R = " + value / 2 / pi);
            case 4 -> System.out.println("R = " + Math.sqrt(value / pi) + " D = " + 2 * (Math.sqrt(value / pi)) + " L = " + 2 * pi * Math.sqrt(value / pi));
        }
    }
}
