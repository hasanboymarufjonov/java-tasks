package gita.foundation.problems_2;

import java.util.Scanner;

public class integer_4 {
    public static void main(String[] args) {
        int a, b, n;
        Scanner input = new Scanner(System.in);
        System.out.println("A kesma uzunligini kiriting: ");
        a = input.nextInt();
        System.out.println("B kesma uzunligini kiriting: ");
        b = input.nextInt();

        n = a / b;

        System.out.println(a + " kesma ichiga " + b + " kesmadan " + n + " ta joylashtirish mumkin");
    }
}
