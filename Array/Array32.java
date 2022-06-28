package Array;

public class Array32 {

    public static void main(String[] args) {
        int[] array = ArrayUtil.generateRand(20);
        ArrayUtil.show(array);
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            // Local minimum -> a[i-1] > a[i] && a[i] < a[i+1]
            // Local maximum -> a[i-1] < a[i] && a[i] > a[i+1]

            // boolean isLocalMax = array[i - 1] < array[i] && array[i] > array[i + 1];
            boolean isLocalMin = array[i - 1] > array[i] && array[i] < array[i + 1];

            if (isLocalMin)
                return i;
        }
        return -1;
    }
}

// 82 24 17 32 35 25