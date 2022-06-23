package FunSimple;

public class FunSimple20 {
    public static void main(String[] args) {
        System.out.println(traingleP(3, 4));
        System.out.println(traingleP(6, 8));
        System.out.println(traingleP(7, 24));
        System.out.println(traingleP(12, 5));
    }

    static double traingleP(double a, double b) {
        double c, p;
        c = Math.pow(a * a + b * b, 1. / 2);
        p = a + b + c;
        return p;
    }
}
