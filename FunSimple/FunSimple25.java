package FunSimple;

public class FunSimple25 {
    public static void main(String[] args) {
        isquarte(8);
        isquarte(9);
        isquarte(36);
    }

    static void isquarte(double a) {
        if (Math.sqrt(a) == (int) Math.sqrt(a))
            System.out.println(true);
        else
            System.out.println(false);
    }

}
