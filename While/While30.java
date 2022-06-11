package While;

public class While30 {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 3, i = 0, j = 0, sum = 0, d = 0;

        while (a >= c) {
            a = a - c;
            i++;
        }

        while (b >= c) {
            b = b - c;
            j++;
        }

        // 4* 7 = 4 ta 7

        while (d < j) {
            d++;
            sum += i;
        }

        System.out.println(sum);

        System.out.println(i);
        System.out.println(j);
    }
}
