package Array;

import Array.ArrayLibrary;

public class Array74 {
    public static void main(String[] args) {
        int[] massiv = new int[10];
        ArrayLibrary.massiv_toldirish(massiv);
        ArrayLibrary.showArray(massiv);

        System.out.println();

        katta_kichik_index(massiv);
        ArrayLibrary.showArray(massiv);
    }

    static int[] katta_kichik_index(int[] massiv) {
        int min = massiv[0];
        int max = massiv[0];
        int m = 0, k = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (min > massiv[i]) {
                min = massiv[i];
                m = i;
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            if (max < massiv[i]) {
                max = massiv[i];
                k = i;
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            if (i != m && i != k)
                massiv[i] = 0;
        }

        return massiv;
    }

}
