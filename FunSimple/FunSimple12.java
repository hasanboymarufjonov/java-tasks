package FunSimple;

public class FunSimple12 {
    public static void main(String[] args) {
        Sortinc(45, 12, 98);
        Sortinc(98, 18, 198);
        Sortinc(98, 458, 19);
    }

    static void Sortinc(int a, int b, int c) {
        if (Math.max(a, b) < c)
            System.out.println(Math.min(a, b) + "  " + Math.max(a, b) + "  " + c);
        if (Math.max(a, b) > c) {
            if (Math.min(a, b) > c)
                System.out.println(c + "  " + Math.min(a, b) + "  " + Math.max(a, b));
            else
                System.out.println(Math.min(a, b) + "  " + c + "  " + Math.max(a, b));
        }
    }
}
