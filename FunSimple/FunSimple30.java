package FunSimple;

public class FunSimple30 {
    public static void main(String[] args) {
        System.out.println(digitcount(4567));
        System.out.println(digitcount(454567));
        System.out.println(digitcount(123456789));
    }

    static int digitcount(int a) {
        int counter = 0;
        while (a > 0) {
            a /= 10;
            counter++;
        }
        return counter;
    }

}
