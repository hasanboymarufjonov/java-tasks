package While;

public class While28 {
    public static void main(String[] args) {
        solution(22);

    }

    public static void solution(int n) {
        // 1 1 2 3 5 8 13 21
        int a1 = 2, an, k = 1;
        do {
            an = 2 + 1 / a1;
            a1 = an;
            k++;

        } while (Math.abs(an - a1) < n);

        System.out.println(k);
        System.out.println(an);
        System.out.println(a1);

    }
}
