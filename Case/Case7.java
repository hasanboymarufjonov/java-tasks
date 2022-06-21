package Case;

import java.util.Scanner;

public class Case7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Weight = ");
            double value;
            value = input.nextDouble();
            System.out.println("1: kg, 2: mg, 3: g, 4: t, 5: sr");
            int weight = input.nextInt();

            switch (weight) {
                case 1 -> System.out.println(value + " kg " + value + " kg");
                case 2 -> System.out.println(value + " mg " + value / 1000000 + " kg");
                case 3 -> System.out.println(value + " g " + value / 1000 + " kg");
                case 4 -> System.out.println(value + " t " + value * 1000 + " kg");
                case 5 -> System.out.println(value + " sr " + value * 100 + " kg");
                default -> System.out.println("Error");
            }
        }
    }
}
