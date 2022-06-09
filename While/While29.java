package While;

public class While29 {
    public static void main(String[] args) {
        int a1 = 1, a2 = 2, an, n = 20;

        do {
            an = (a1 + 2 * a2) / 3;
            a1 = a2;
            a2 = an;
        } while (Math.abs(an - a1) > n);

        System.out.println(an);
        System.out.println(a1);
    }
}
