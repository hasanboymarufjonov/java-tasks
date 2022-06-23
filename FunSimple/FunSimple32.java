package FunSimple;

public class FunSimple32 {
    public static void main(String[] args) {
        System.out.printf(" %.3f \n", degrorad(30));
        System.out.printf("%,3f \n", degrorad(60));
        System.out.printf("%.3f \n", degrorad(90));
    }

    static double degrorad(int g) {
        double r;
        r = g * (3.14 / 180);
        return r;
    }
}
