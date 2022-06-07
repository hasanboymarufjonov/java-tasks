package While;

public class While8 {
    public static void main(String[] args) {
        int i = 0;
        int n = 100;
        while (true) {

            i++;

            if (i * i > n) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}
