package Array;

import Array.ArrayLibrary;

public class Array73 {
    public static void main(String[] args) {
        int[] array2 = new int[8];
        ArrayLibrary.massiv_toldirish(array2);
        ArrayLibrary.showArray(array2);

        System.out.println();

        next_sorting(array2, 2, 6);
        ArrayLibrary.showArray(array2);

    }

    static void next_sorting(int[] massiv, int h, int k) {
        int m = h + 1;
        int l = k - 1;

        for (int i = m; i <= k - h - 1; i++) {
            int t = massiv[i];
            massiv[i] = massiv[l];
            massiv[l] = t;
            l--;
        }
    }

}
