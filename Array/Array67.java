package Array;

import Array.ArrayLibrary;

public class Array67 {
    public static void main(String[] args) {
        int[] array = new int[5];
        ArrayLibrary.massiv_toldirish(array);
        ArrayLibrary.showArray(array);
        System.out.println();
        toq_sonlar(array);
        ArrayLibrary.showArray(array);

    }

    static int[] toq_sonlar(int[] massiv) {
        int a = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 1)
                a = massiv[i];
        }
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 == 1)
                massiv[i] += a;
        }

        return massiv;
    }

}
