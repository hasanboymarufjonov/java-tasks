package FunSimple;

public class FunSimple17 {
    public static void main(String[] args) {

        input(4, -4, 1);
    }

    public static void input(double a, double b, double c) {
        double d, x1, x2;
        d = b * b - 4 * a * c;
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
            System.out.println("2 ta");

        } else if (d == 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println("1 ta");
        } else {
            System.out.println("Yechimga ega emas");

        }

    }
}