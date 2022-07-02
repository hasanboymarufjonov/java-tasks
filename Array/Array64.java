package Array;

public class Array64 {
    public static void main(String[] args) {
        int[] a = { 1, 5, 7, 8, 9 };
        int[] b = { -5, -8, 6, 10, 12 };
        int[] e = { -7, -2, 16, 180, 412 };
        int[] c = new int[a.length + b.length + e.length];
        int index = 0;
        for (int t : a) {
            c[index++] = t;
        }
        for (int t : b) {
            c[index++] = t;
        }
        for (int t : e) {
            c[index++] = t;
        }
        osish_tartibi(c);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "  ");
        }
    }

    public static int[] osish_tartibi(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }

}
