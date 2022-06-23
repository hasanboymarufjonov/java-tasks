package FunSimple;

public class FunSimple38 {
    public static void main(String[] args) {
        System.out.println(pow2(2, 5) == 32);
        System.out.println(pow2(2, -5));
    }

    static double pow2(int a, int n) {
        double c;
        if (n > 0) {
            c = Math.pow(a, n);
        } else {
            c = 1 / Math.pow(a, Math.abs(n));
        }
        return c;
    }
}
