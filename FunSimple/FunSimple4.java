package FunSimple;

public class FunSimple4 {
    public static void main(String[] args) {
        Triangle(5);
    }

    public static void Triangle(double a) {
        double p = a * 3;
        double s = Math.sqrt(3) / 4 * a;

        System.out.println(p);
        System.out.println(s);
    }
}
