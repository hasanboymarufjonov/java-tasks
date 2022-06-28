package Case;

import java.util.Scanner;

public class Case13 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int type, value;
            double a, c, h, s;

            type = input.nextInt();
            value = input.nextInt();

            switch (type) {
                case 1:
                    a = value;
                    c = a * Math.sqrt(2);
                    h = c / 2;
                    s = c * h / 2;
                    System.out.println("c = " + c + " h = " + h + " s = " + s);
                    break;
                case 2:
                    c = value;
                    a = c / Math.sqrt(2);
                    h = c / 2;
                    s = c * h / 2;
                    System.out.println("a = " + a + " h = " + h + " s = " + s);
                    break;
                case 3:
                    h = value;
                    c = 2 * h;
                    a = c / Math.sqrt(2);
                    s = c * h / 2;
                    System.out.println("a = " + a + " c = " + c + " s = " + s);
                    break;
                case 4:
                    s = value;
                    h = Math.sqrt(s);
                    c = 2 * h;
                    a = c / Math.sqrt(2);
                    System.out.println("a = " + a + " c = " + c + " h = " + h);
                    break;
            }
        }

    }
}
