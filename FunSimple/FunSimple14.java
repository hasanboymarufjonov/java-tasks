package FunSimple;

public class FunSimple14 {
    public static void main(String[] args) {
        shift_right(45, 12, 23);
        shift_right(1, 2, 3);
    }

    static void shift_right(int a, int b, int c) {
        int d = c;
        c = b;
        b = a;
        a = d;
        System.out.println(a + " " + " " + b + " " + c);

    }
}
