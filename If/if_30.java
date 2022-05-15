package gita.foundation.problems_4;

import java.util.Scanner;

public class if_30 {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);

        System.out.print("Son = ");
        x = input.nextInt();

        if (x >= 1 && x < 10 && x % 2 == 1){
            System.out.println("Bir xonali, toq son");
        } else if (x >= 1 && x < 10 && x % 2 == 0){
            System.out.println("Bir xonali, juft son");
        } else if (x >= 10 && x < 100 && x % 2 == 1){
            System.out.println("Ikki xonali, toq son");
        } else if (x >= 10 && x < 100 && x % 2 == 0){
            System.out.println("Ikki xonali, juft son");
        } else if (x >= 100 && x < 1000 && x % 2 == 0) {
            System.out.println("Uch xonali, juft son");
        } else if (x >= 100 && x < 1000 && x % 2 == 1) {
            System.out.println("Uch xonali, toq son");
        }
    }
}
