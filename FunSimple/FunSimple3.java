package FunSimple;

public class FunSimple3 {
    public static void main(String[] args) {
        MEAN(4, 2);
    }

    public static void MEAN(double A, double B) {
        double a = (A + B) / 2;
        double h = Math.sqrt(A * B);

        System.out.println(a);
        System.out.println(h);
    }
}
