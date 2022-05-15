package gita.foundation.problems_4;

import java.util.Scanner;

public class if_19 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner input = new Scanner(System.in);

        System.out.println("Sonlarni kiriting: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
// 1 2 1 1
        if (a == b){
            if (b == c) {
                System.out.println("4");
            } else {
                System.out.println("3");
            }
        } else {
            if (b == c) {
                System.out.println("1");
            }
            else {
                System.out.println("2");
            }
        }
    }
}
