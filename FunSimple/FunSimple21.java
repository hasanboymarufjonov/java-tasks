package FunSimple;

public class FunSimple21 {
    public static void main(String[] args) {

        System.out.println(summRange(5, 9));
        System.out.println(summRange(8, 7));

    }

    static int summRange(int a, int b) {
        int sum = 0;
        if (a > b)
            return sum;
        else
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        return sum;
    }
}
