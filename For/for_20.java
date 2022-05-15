package gita.foundation.problems_6;

public class for_20 {
    public static void main(String[] args) {
        int i, f = 1, b = 0;

        int a = 3;

        for(i = 1; i <= a; i++){
            f = f * i;
            b = b + f;
        }
        System.out.println(b);
    }
}
