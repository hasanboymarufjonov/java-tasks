package gita.foundation.problems_5;


import java.util.Scanner;

public class case_14 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double a, r, R, s;
            int n;
            System.out.println("Type: ");
            n = input.nextInt();

            switch (n) {
                case 1:
                    System.out.println("a=");
                    a = input.nextDouble();
                    System.out.println("r=" + a * Math.sqrt(3) / 6);
                    System.out.println("R=" + a * Math.sqrt(3) / 3);
                    System.out.println("s=" + a * a * Math.sqrt(3) / 4);
                    break;
                case 2:
                    System.out.println("r=");
                    r = input.nextDouble();
                    System.out.println("a=" + r * 6 / Math.sqrt(3) / 6);
                    System.out.println("R=" + r * 2);
                    System.out.println("s=" + r * 6 / Math.sqrt(3) / 6 * r * 6 / Math.sqrt(3) / 6 * Math.sqrt(3) / 4);
                    break;
                case 3:
                    System.out.println("R=");
                    R = input.nextDouble();
                    System.out.println("r=" + R / 2);
                    System.out.println("a=" + R * 3 / Math.sqrt(3));
                    System.out.println("s=" + R * 3 / Math.sqrt(3) * R * 3 / Math.sqrt(3) * Math.sqrt(3) / 4);
                    break;
                case 4:
                    System.out.println("s=");
                    s = input.nextDouble();
                    System.out.println("r=" + Math.sqrt(4 * s / Math.sqrt(3)) * Math.sqrt(3) / 6);
                    System.out.println("R=" + Math.sqrt(4 * s / Math.sqrt(3)) * Math.sqrt(3) / 3);
                    System.out.println("a=" + Math.sqrt(4 * s / Math.sqrt(3)));
                    break;
                default:
                    System.out.println("Error");
            }
        }
}
