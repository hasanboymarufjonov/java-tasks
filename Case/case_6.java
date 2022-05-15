package Case;

import java.util.Scanner;

public class case_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length = ");
        double lengthvalue;
        lengthvalue = input.nextDouble();
        System.out.println("1: dm, 2: km, 3: m, 4: mm, 5: sm");
        int length = input.nextInt();

        switch (length) {
            case 1 -> System.out.println(lengthvalue + " dm " + lengthvalue / 10 + " m");
            case 2 -> System.out.println(lengthvalue + " km " + lengthvalue * 1000 + " m");
            case 3 -> System.out.println(lengthvalue + " m " + lengthvalue + " m");
            case 4 -> System.out.println(lengthvalue + " mm " + lengthvalue / 1000 + " m");
            case 5 -> System.out.println(lengthvalue + " sm " + lengthvalue / 100 + " m");
            default -> System.out.println("Error");
        }
    }
}
