package Array;

public class Array59 {
    public static void main(String[] args) {
        // 2 ta elementlari soni bir xil bolgan massiv beriladi
        // a massiv kritiladi
        // b massiv esa esa hudduki fibonachi sonlari kabi hosil qilinib
        // indexiga bolib qoyiladi
        int[] a_massiv = { 1, 5, 8, -5, };
        // result -> 1 6 7 3

        new1_massiv(a_massiv);
    }

    static void new1_massiv(int[] array) {
        int[] b = new int[array.length];
        int sum = array[0];
        System.out.print(array[0] + "  ");
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            b[i] = sum / i;
            System.out.print(b[i] + "  ");
        }

    }

}
