package While;

public class While12 {
    public static void main(String[] args) {
        int i = 1;

        int sum = 0;

        int n = 50;

        while (sum <= n) {
            sum += i;
            i++;
        }

        System.out.println(i - 1);
    }
}
