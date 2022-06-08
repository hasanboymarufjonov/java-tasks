package While;

public class While15 {
    public static void main(String[] args) {
        int s = 1000;
        int p = 20;
        double sum = s;
        int count = 0;

        while (sum < s * 2) {
            sum = sum + sum * p / 100.0;
            count++;
        }

        System.out.println(count);
        System.out.println(sum);
    }
}
