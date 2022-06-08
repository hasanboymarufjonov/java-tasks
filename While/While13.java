package While;

public class While13 {
    public static void main(String[] args) {
        int i = 1;

        int sum = 0;

        int n = 50;

        while (sum < n) {
            sum += 1 / i;
            i++;
        }

        System.out.println(i);
    }
}
