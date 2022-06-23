package Lesson18;

public class Array85 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        for (int i = arr.length; i > 0; i++) {
            arr[i] = arr[i - 3];
            System.out.println(arr[i]);
        }

    }
}
