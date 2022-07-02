package Array;

public class Array65 {
    public static void main(String[] args) {
        int[] arrray = { 1, 4, 5, -6, 8, 7, 11, 20 };
        add(arrray, 5);
        Array62.showarray(arrray);

    }

    public static int[] add(int[] array, int k) {
        int a = array[k];
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + a;
        }

        return array;
    }

}
