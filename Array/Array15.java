package Array;

public class Array15 {
    public static void main(String[] args) {

        int[] arr = { 10, 13, 26, 21, 19, 1, 2, 8, 14, 19 };
        solution(arr, 2);
    }

    public static void solution(int[] array, int k) {

        for (int i = 1; i < array.length; i += 2) {

            System.out.print(array[i] + "\t");
        }

        for (int i = array.length - 2; i >= 0; i -= 2) {

            System.out.print(array[i] + "\t");

        }

    }
}
