package FunSimple;

public class FunSimple11 {

    static int a, b;

    public static void main(String[] args) {
        a = 7;
        b = 8;
        swap();
        show();
    }

    public static void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public static void show() {
        System.out.printf("%d, %d", a, b);
    }
}
