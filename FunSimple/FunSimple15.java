package FunSimple;

public class FunSimple15 {
    public static void main(String[] args) {
        shift_right(1, 2, 3);
        shift_left(1, 2, 3);
        shift_right(10, 20, 30);
        shift_left(10, 20, 30);
    }

    static void shift_left(int a, int b, int c) {
        int d = a;
        a = b;
        b = c;
        c = d;
        System.out.println(a + " " + b + " " + c);
    }

    static void shift_right(int a, int b, int c) {
        int d = c;
        c = b;
        b = a;
        a = d;
        System.out.println(a + " " + " " + b + " " + c);

    }
}
