package For;

public class for_5 {
    public static void main(String[] args) {
        int a = 100;
        double c;

        for (double i = 0.1; i < 1.0; i += 0.1) {
            c = a * i;
            System.out.printf("%.0f%n", c);
        }
    }
}
