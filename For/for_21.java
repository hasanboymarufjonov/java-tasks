package gita.foundation.problems_6;

public class for_21 {
    public static void main(String[] args) {
        double i, f = 1, b = 0;

        double a = 2;

        for(i = 1; i <= a; i++){
            f = f * i;
            b = b + 1/f;
        }
        System.out.println(b);
    }
}
