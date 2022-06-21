package Array;

public class Array1 {
    public static void main(String[] args) {
        func(10);
    }

    public static void func(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i + 1;
            System.out.println(arr[i]);
        }

    }
}
