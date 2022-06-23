package FunSimple;

public class FunSimple36 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1);
        fib(6); //
        // fib(7); //
    }

    static void fib(int n) {
        int fib = 0;
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int c;
            fib = a + b;
            System.out.println(fib);
            a = b;
            b = fib;
        }
    }
}
