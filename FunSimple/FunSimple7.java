package FunSimple;

public class FunSimple7 {
    public static void main(String[] args) {
        InvertDigit(-4234);
    }

    public static void InvertDigit(int a) {
        a = Math.abs(a);
        while (a > 0) {
            System.out.print(a % 10);
            a /= 10;
        }
    }
}
