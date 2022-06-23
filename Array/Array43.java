package Array;

public class Array43 {

    public static void main(String[] args) {
        int[] array = { -1, -2, -3, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 7 };
        System.out.println(solution(array));
        // -1 1
        // -2 1
        // -3 1
        // 0 3
        // 1 5
        // ...
    }

    // -1 -2 -3 0 0 0 1 1 1 1 1 2 2 3 3 3 3 5 5 5 5 6 6 6 7 7 7 7 7 7
    // 10
    // if(a[i]!=a[i-1]) counter++
    public static int solution(int[] array) {
        int counter = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1])
                counter++;
        }
        return counter;
    }
}
