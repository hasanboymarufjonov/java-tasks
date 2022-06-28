package Array;

public class Array40 {

    public static void main(String[] args) {
        int[] array = ArrayUtil.generateRand(20);
        ArrayUtil.show(array);
        System.out.println(solution(array, 100));
    }

    public static int solution(int[] array, int r) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int element : array) { // a[0],a[1],a[2]...
            if (min > Math.abs(r - element)) {
                min = Math.abs(r - element);
                result = element;
            }
        }
        return result;
    }
}
