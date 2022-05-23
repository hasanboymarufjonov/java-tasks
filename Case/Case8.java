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
                case 1 -> d <= 31 ? System.out.println("one") : System.out.println("two");
                
                // if (d <= 31) {
                // System.out.println(d + "-yanvar");
                // } else
                // System.out.println("Bu oyda 31 kun mavjud");

                /*
                 * case 2:
                 * if (d <= 28) {
                 * System.out.println(d + "-fevral");
                 * } else
                 * System.out.println("Bu oyda 28 kun mavjud");
                 * break;
                 * case 3:
                 * if (d <= 31) {
                 * System.out.println(d + "-mart");
                 * } else
                 * System.out.println("Bu oyda 31 kun mavjud");
                 * break;
                 * case 4:
                 * if (d <= 30) {
                 * System.out.println(d + "-aprel");
                 * } else
                 * System.out.println("Bu oyda 30 kun mavjud");
                 * break;
                 * case 5:
                 * if (d <= 31) {
                 * System.out.println(d + "-may");
                 * } else
                 * System.out.println("Bu oyda 31 kun mavjud");
                 * break;
                 * case 6:
                 * if (d <= 30) {
                 * System.out.println(d + "-iyun");
                 * } else
                 * System.out.println("Bu oyda 30 kun mavjud");
                 * break;
                 * case 7:
                 * if (d <= 31) {
                 * System.out.println(d + "-iyul");
                 * } else
                 * System.out.println("Bu oyda 31 kun mavjud");
                 * break;
                 * case 8:
                 * if (d <= 31) {
                 * System.out.println(d + "-avgust");
                 * } else
                 * System.out.println("Bu oyda 31 kun mavjud");
                 * break;
                 * case 9:
                 * if (d <= 30) {
                 * System.out.println(d + "-sentabr");
                 * } else
                 * System.out.println("Bu oyda 30 kun mavjud");
                 * break;
                 * case 10:
                 * if (d <= 31) {
                 * System.out.println(d + "-oktabr");
                 * } else
                 * System.out.println("Bu oyda 31 kun mavjud");
                 * break;
                 * case 11:
                 * if (d <= 30) {
                 * System.out.println(d + "-noyabr");
                 * } else
                 * System.out.println("Bu oyda 30 kun mavjud");
                 * break;
                 * case 12:
                 * if (d <= 31) {
                 * System.out.println(d + "-dekabr");
                 * } else
                 * System.out.println("Bu oyda 31 kun mavjud");
                 * break;
                 * default:
                 * System.out.println("Bunday oy mavjud emas");
                 * }
                 */
            }
        }
    }
}
