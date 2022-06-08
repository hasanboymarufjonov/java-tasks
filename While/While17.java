package While;

public class While17 {
    public static void main(String[] args) {
        int n = 145;
        int m = 20;
        int count = 0;

        while (n > m) {
            n -= m;
            count++;
        }

        System.out.println(count);
        System.out.println(n);
    }
}
