package While;

public class While10 {
    public static void main(String[] args) {
        int i = 1;
        int n = 100;
        int count = 0;

        while (true) {

            i *= 3;
            count++;
            if (i > n) {
                System.out.println(count - 1);
                break;
            }
        }
    }
}