package While;

public class While16 {
    public static void main(String[] args) {
        double s = 10;
        int p = 20;
        double sum = 200;
        int count = 0;

        while (s <= sum) {
            s = s + s * p / 100.0;
            count++;
        }

        System.out.println(count);
        System.out.println(s);
    }
}
