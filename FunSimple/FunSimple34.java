package FunSimple;

public class FunSimple34 {
    public static void main(String[] args) {
        System.out.println(fact(6));
        System.out.println(fact(4));
        System.out.println(fact(8));
    }

    static int fact(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
