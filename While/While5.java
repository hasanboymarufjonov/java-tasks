package While;

public class While5 {
    public static void main(String[] args) {
        int n = 64;
        int pow = 0;

        while (n > 1) {
            n = n / 2;
            System.out.println(n);
            pow++;

        }
        System.out.println(pow);
    }
}
