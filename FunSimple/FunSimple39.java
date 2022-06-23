package FunSimple;

public class FunSimple39 {
    public static void main(String[] args) {

        System.out.println(power3(4, 2.5));

    }

    static double power3(int a, double n) {
        double c;
        if ((n - (int) n) > 0) {
            c = 1 / Math.pow(a, n);
        } else {
            c = Math.pow(a, n);
        }
        return c;
    }
}
