package Array;

public class Array68 {
    public static void main(String[] args) {
        int[] almashtirish = { 1, 5, 7, 9, 6 };
        // result -> 9 5 7 1 6

        almashish(almashtirish);
    }

    static void almashish(int[] array) {
        int min = array[0], max = array[0], k = 0, m = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                k = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                m = i;
            }
        }
        int x = array[k];
        array[k] = array[m];
        array[m] = x;
        ArrayLibrary.showArray(array);
    }

}
