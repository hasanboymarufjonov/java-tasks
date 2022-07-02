package Array;

import Array.ArrayLibrary;

public class Array71 {
    public static void main(String[] args) {
        int[] massiv = new int[8];
        ArrayLibrary.massiv_toldirish(massiv);
        ArrayLibrary.showArray(massiv);
        System.out.println();
        sorting2(massiv);
        ArrayLibrary.showArray(massiv);

    }

    static void sorting2(int[] array) {
        int u = array.length / 2;
        int m = array.length - 1;
        for (int i = 0; i < u; i++) {
            int t = array[i];
            array[i] = array[m];
            array[m] = t;
            m--;
        }

    }
}
