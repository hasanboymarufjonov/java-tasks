package While;

public class While21 {
    public static void main(String[] args) {
        int a = 248;
        String txt = "yo'q";

        while (a > 0) {
            if (a % 2 == 1) {
                txt = "bor";
                break;
            }
            a /= 10;
        }

        System.out.println(txt);
    }
}