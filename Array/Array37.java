package Array;

import Array.ArrayUtil;

public class Array37 {

    public static void main(String[] args) {
        int[] array = ArrayUtil.generateRand(30);
        ArrayUtil.show(array);
        // 5
        System.out.println(solution(array));
    }

    /**
     * 1 2 3 4 5 2 3 4 5 9 6 8 5 1 2 3
     * isLocalMax || a[i]>a[i-1] && i==length-1
     * count++
     * 5 9 8 3
     * counter++
     * <p>
     * 1 2 3 4 5
     * 2 3 4 5 9
     * 6 8
     * 1 2 3 *
     */
    public static int solution(int[] array) {
        // Local maximum -> a[i-1] < a[i] && a[i] > a[i+1]
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            // Local maximum -> a[i-1] < a[i] && a[i] > a[i+1]
            // 1 2 3 4 5 2 3 4 5 9 6 8 5 1 2 3
            if (i != array.length - 1) {
                boolean isLocalMax = array[i - 1] < array[i] && array[i] > array[i + 1];
                if (isLocalMax) {
                    counter++;
                }
            } else {
                if (array[i] > array[i - 1])
                    counter++;
            }
        }
        return counter;
    }
}
