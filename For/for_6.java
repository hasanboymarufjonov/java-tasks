package For;

public class for_6 {
    public static void main(String[] args) {
        int a = 100;
        double c;

        for (double i = 1.2; i < 2; i += 0.2) {
            c = a * i;
            System.out.printf("%.0f%n", c);
        }
    }
}
