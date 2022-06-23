package FunSimple;

public class FunSimple37 {
    public static void main(String[] args) {
        System.out.println(pow(2, 3) == 8);
        System.out.println(pow(2, 5) == 32);
    }

    static double pow(int a, int b) {
        double c = Math.pow(a, b);

        return c;
    }
}
