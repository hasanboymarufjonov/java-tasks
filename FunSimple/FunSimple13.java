package FunSimple;

public class FunSimple13 {
    public static void main(String[] args) {
        sortdec(45, 89, 12);
        sortdec(5, 8, 12);
        sortdec(45, 109, 122);
    }

    static void sortdec(int a, int b, int c) {
        if (Math.max(a, b) < c)
            System.out.println(c + " " + Math.max(a, b) + " " + Math.min(a, b));
        if (Math.max(a, b) > c) {
            if (Math.min(a, b) > c)
                System.out.println(Math.max(a, b) + "  " + Math.min(a, b) + "  " + c);
            else
                System.out.println(Math.max(a, b) + "  " + c + "  " + Math.min(a, b));
        }
    }
}
