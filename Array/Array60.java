package Array;

public class Array60 {
    public static void main(String[] args) {
        // yangi massiv k elementdan boshlab oxirgi elementigacha bolgan elementlari
        // yigindisiga teng boladi
        int[] massiv = { 1, 2, 3, 4, 5 };
        // result -> 15 14 12 9 5
        summa(massiv);

    }

    static void summa(int[] array) {
        int[] b = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            b[i] = kerakli(array, i);
            System.out.print(b[i] + "  ");
        }
    }

    static int kerakli(int[] arr, int k) {
        int sum = 0;
        for (int i = arr.length - 1; i >= k; i--) {
            sum += arr[i];
        }
        return sum;
    }

}
