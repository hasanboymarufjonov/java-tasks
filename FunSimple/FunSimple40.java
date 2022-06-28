package FunSimple;

public class FunSimple40 {
    public static void main(String[] args) {
        exp(2, 0.5);
    }

    static void exp(int a, double b) {
        double s;

        for (int i = 0; i <= 100; i++) {
            s = Math.pow(a, i) / (fact(i));
            if (s < b)
                break;
            System.out.println(s);
        }
    }

    static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }

        return f;
    }
}
