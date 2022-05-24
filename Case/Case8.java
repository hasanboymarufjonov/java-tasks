package Case;

import java.util.Scanner;

public class Case8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int d, m;
            System.out.print("Kunni kiriting = ");
            d = input.nextInt();
            System.out.print("Oyni kiriting = ");
            m = input.nextInt();

            switch (m) {
                case 1 -> System.out.println(d <= 31 ? d + "-yanvar" : "Bu oyda 31 kun mavjud");
                case 2 -> System.out.println(d <= 28 ? d + "-fevral" : "Bu oyda 28 kun mavjud");
                case 3 -> System.out.println(d <= 31 ? d + "-mart" : "Bu oyda 31 kun mavjud");
                case 4 -> System.out.println(d <= 30 ? d + "-aprel" : "Bu oyda 30 kun mavjud");
                case 5 -> System.out.println(d <= 31 ? d + "-may" : "Bu oyda 31 kun mavjud");
                case 6 -> System.out.println(d <= 30 ? d + "-iyun" : "Bu oyda 30 kun mavjud");
                case 7 -> System.out.println(d <= 31 ? d + "-iyul" : "Bu oyda 31 kun mavjud");
                case 8 -> System.out.println(d <= 31 ? d + "-avgust" : "Bu oyda 31 kun mavjud");
                case 9 -> System.out.println(d <= 30 ? d + "-sentabr" : "Bu oyda 30 kun mavjud");
                case 10 -> System.out.println(d <= 31 ? d + "-oktabr" : "Bu oyda 31 kun mavjud");
                case 11 -> System.out.println(d <= 30 ? d + "-noyabr" : "Bu oyda 30 kun mavjud");
                case 12 -> System.out.println(d <= 31 ? d + "-dekabr" : "Bu oyda 31 kun mavjud");
                default -> System.out.println("Bunday oy mavjud emas");
            }
        }
    }
}
