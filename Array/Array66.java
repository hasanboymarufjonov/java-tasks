package Array;

public class Array66 {
    public static void main(String[] args) {
        int[] a = { 1, 5, 6, 7, 8, 9, 10, 12, 16 };
        Array62.showarray(a);
        System.out.println();
        juftsonlar(a);
        Array62.showarray(a);
    }

    public static int[] juftsonlar(int[] array) {
        int a = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                a = array[j];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                array[i] += a;
        }

        return array;
    }
}
