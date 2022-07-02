package Array;

public class Array70 {
    public static void main(String[] args) {
        int[] array = new int[8];
        ArrayLibrary.massiv_toldirish(array);
        ArrayLibrary.showArray(array);
        System.out.println();
        sort2(array);
        NeedArray.showArray(array);

    }

    static void sort2(int[] array) {
        int n = array.length / 2;
        int m = array.length / 2;
        for (int i = 0; i < n; i++) {
            int t = array[i];
            array[i] = array[m];
            array[m] = t;
            m++;

        }

    }

}
