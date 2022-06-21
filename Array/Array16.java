package Array;

public class Array16 {
    public static void main(String[] args) {

        int[] arr = { 10, 13, 26, 21, 19, 1, 2, 8, 14, 19 };
        solution(arr, 2);
    }

    public static void solution(int[] array, int k) {

        for (int i = 0; i < array.length / 2; i++) {

            System.out.print(array[i] + "\t");
        }

        for (int i = array.length - 1; i >= array.length / 2; i--) {

            System.out.print(array[i] + "\t");

        }

    }
}
