// 66

public class Exam4 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        show(array);
        array = invert(array);
        show(array);
    }

    public static void show(int[] array) {
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    public static int[] invert(int[] array) {
        int t;
        for (int i = 0; i < array.length / 2; i++) {
            t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
        return array;
    }
}
