package While;

public class While20 {
    public static void main(String[] args) {
        int a = 113;
        String txt = "yo'q";

        while (a > 0) {
            if (a % 10 == 2) {
                txt = "bor";
                break;
            }
            a /= 10;
        }

        System.out.println(txt);

    }
}
