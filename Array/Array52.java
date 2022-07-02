package Array;

public class Array52 {
    public static void main(String[] args) {
        int[] a_massiv = { 1, -2, 3, -4, -5 };
        // result => 2, -4, 6, -8, -10
        tekshir1(a_massiv);

    }

    static void tekshir1(int[] array) {
        int a = 5, count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < a)
                count++;
        }
        int[] b_massiv = new int[array.length];
        if (count == array.length) {
            for (int i = 0; i < array.length; i++) {
                b_massiv[i] = 2 * array[i];
                System.out.print(b_massiv[i] + " ");
            }
        } else
            for (int i = 0; i < array.length; i++) {
                b_massiv[i] = array[i] / 2;
                System.out.print(b_massiv[i] + "  ");

            }

    }
}
