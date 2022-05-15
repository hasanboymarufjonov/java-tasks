package gita.foundation.problems_6;

public class for_17 {
    public static void main(String[] args) {
        int a = 2, n = 3, an = a, b = 0;
        for (int i = 1; i < n; i++) {
            an *=a;
            b +=an;
            System.out.println(an);
            System.out.println(b);
        }
    }
}
