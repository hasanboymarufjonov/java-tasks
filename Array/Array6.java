package Array;

public class Array6 {
    public static void main(String[] args) {
        func(10, 12, 16);
    }

    // Fi = Fi-1 + F-2

    public static void func(int n, int a, int b) {
        int arr[] = new int[n];
        arr[0] = a;
        arr[1] = b;
        int sum = a + b;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for (int i = 2; i < arr.length; i++) {
            arr[i] = sum;
            sum *= 2;
            System.out.println(arr[i]);
        }
    }
}
