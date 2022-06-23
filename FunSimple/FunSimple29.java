package FunSimple;

public class FunSimple29 {
    public static void main(String[] args) {
        System.out.println(digitcount(78) + " xonali son");
        System.out.println(digitcount(178) + " xonali son");
        System.out.println(digitcount(7228) + " xonali son");
    }

    static int digitcount(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
