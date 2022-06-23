package FunSimple;

public class FunSimple31 {
    public static void main(String[] args) {

        System.out.println(ispolindrom(1234321));
        System.out.println(ispolindrom(12521));
        System.out.println(ispolindrom(11322));

    }

    static boolean ispolindrom(int x) {
        boolean result = true;
        for (int i = 1; i <= digitcount(x) / 2; i++) {
            result = result && readLTR(x, i) == readRTL(x, i);
        }

        return result;
    }

    static int digitcount(int a) {
        int counter = 0;
        while (a > 0) {
            a /= 10;
            counter++;
        }
        return counter;
    }

    static int readRTL(int n, int k) {
        if (digitcount(n) < k)
            return -1;
        int raqam = -1;
        for (int i = 0; i < k; i++) {
            raqam = n % 10;
            n /= 10;

        }
        return raqam;
    }

    static int readLTR(int n, int k) {
        int t = 0;
        while (n > 0) {
            t = t * 10 + n % 10;
            n /= 10;
        }
        return readRTL(t, k);
    }

}
