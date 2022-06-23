package FunSimple;

public class FunSimple27 {
    public static void main(String[] args) {
        System.out.println(ispower(125, 5));
        System.out.println(ispower(125, 40));
        System.out.println(ispower(125, 8));
        System.out.println(ispower(216, 6));
    }

    static boolean ispower(int k, int n) {
        int m = 1;
        do {
            m = m * n;
        } while (k > m);
        if (k == m)
            return true;
        else
            return false;
    }
}
