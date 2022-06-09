package While;

public class While23 {
    public static void main(String[] args) {
        int a = 36;
        int b = 24;
        int i = 1;
        int k = 1;

        while (i <= a || i <= b) {

            i++;
            if (a % i == 0 && b % i == 0) {
                k = i;
            }
        }

        System.out.println(k);

    }
}