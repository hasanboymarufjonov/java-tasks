package Array;

public class Array69 {
    public static void main(String[] args) {
        int[] massiv = new int[6];
        ArrayLibrary.massiv_toldirish(massiv);
        ArrayLibrary.showArray(massiv);
        System.out.println();
        sort(massiv);
        ArrayLibrary.showArray(massiv);
    }

    static void sort(int[] array) {
        int n = 0;
        for (int i = 1; i < array.length; i += 2) {
            int t = array[n];
            array[n] = array[i];
            array[i] = t;
            n += 2;

        }

    }

}
