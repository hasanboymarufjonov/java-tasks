package While;

public class While19 {
    public static void main(String[] args) {
        int a = 145;
        int sum = 0;

        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }

        System.out.println(sum);
    }
}
