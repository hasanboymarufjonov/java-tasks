package FunSimple;

public class FunSimple33 {
    public static void main(String[] args) {

        System.out.printf("%.3f \n", redtograd(1));
        System.out.printf("%.3f \n", redtograd(2));
        System.out.printf("%.3f \n", redtograd(4));
    }

    static double redtograd(double r) {
        double g;
        g = r * (180 / 3.14);
        return g;

    }
}
