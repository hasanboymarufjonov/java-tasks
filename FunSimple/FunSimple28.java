package FunSimple;

public class FunSimple28 {
    public static void main(String[] args) {
        System.out.println(isprime(45));
        System.out.println(isprime(7));
        System.out.println(isprime(13));
        System.out.println(isprime(29));
    }

    static boolean isprime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count > 2)
            return true;
        else
            return false;
    }
}
