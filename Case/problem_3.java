package gita.foundation.problems_5_0;

import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fasl raqami = ");
        int season = input.nextInt();

        switch (season) {
            case 1:
                System.out.println("1. Dekabr");
                System.out.println("2. Yanvar");
                System.out.println("3. Fevral");
                break;
            case 2:
                System.out.println("1. Mart");
                System.out.println("2. Aprel");
                System.out.println("3. May");
                break;
            case 3:
                System.out.println("1. Iyun");
                System.out.println("2. Iyul");
                System.out.println("3. Avgust");
                break;
            case 4:
                System.out.println("1. Sentabr");
                System.out.println("2. Oktabr");
                System.out.println("2. Noyabr");
                break;
        }
    }
}
