package Array;

public class Array31 {
    public static void main(String[] args) {
        int[] tekshir = { 1, 5, 7, 9, 4, 78, 35, 14 };
        // result -> 35 78 9
        check(tekshir);
    }

    public static void check(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1])
                System.out.print(arr[i] + "  ");
        }
    }

}
