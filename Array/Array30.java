package Array;

import Array.ArrayUtil;

public class Array30 {

    public static void main(String[] args) {
        int[] array = ArrayUtil.generateRand(20);
        ArrayUtil.show(array);
        solution(array);
    }

    /*
     * 5 8 9 2 3 4 1 0 -3 7
     * 9 4 1 0
     * 4
     */
    public static void solution(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
