package Array;

import Array.ArrayUtil;

public class Array58 {

    public static void main(String[] args) {
        int[] a = ArrayUtil.generateRand(10, 1, 10);
        ArrayUtil.show(a);
        // int[] b = solution1(a);
        // int[] b = solution2(a);

        ArrayUtil.show(solution1(a));
        ArrayUtil.show(solution2(a));
    }

    public static int[] solution1(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += a[j];
            }
            b[i] = sum;
        }
        return b;
    }

    public static int[] solution2(int[] a) {
        int[] b = new int[a.length];
        b[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] + a[i];
        }
        return b;
    }
}
