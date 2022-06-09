package While;

public class While27 {
    public static void main(String[] args) {
        solution(22);

    }

    public static void solution(int n) {
        // 1 1 2 3 5 8 13 21
        int f1 = 1, f2 = 1, fn, count = 0;
        do {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            count++;

        } while (fn < n);

        System.out.println(count);

    }
}
