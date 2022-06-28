package Array;

public class Array53 {
    public static void main(String[] args) {
        int n = 10;
        int[] a = ArrayUtil.generateRand(n);
        int[] b = ArrayUtil.generateRand(n);
        int[] c = new int[n];

        ArrayUtil.show(a);
        ArrayUtil.show(b);

        for (int i = 0; i < n; i++) {
            // c[i] = a[i] > b[i] ? a[i] : b[i];
            c[i] = Math.max(a[i], b[i]);
        }
        ArrayUtil.show(c);

    }
}
