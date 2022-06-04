package While;

public class While4 {
    public static void main(String[] args) {
        int n = 27;
        int three = 3;

        // 3, 9, 27, 81

        while (three <= n) {
            three *= 3;
            if (three == n) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }

    }

}
