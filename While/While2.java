package While;

public class While2 {
    public static void main(String[] args) {
        int a = 105;
        int b = 20;
        int count = 0;
        while (a > b) {
            a -= b;
            count++;
        }

        System.out.println(count);
    }
}
