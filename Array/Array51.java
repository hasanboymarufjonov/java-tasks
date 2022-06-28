package Array;

public class Array51 {
    public static void main(String[] args) {
        int[] array1 = ArrayUtil.generateRand(10);
        int[] array2 = ArrayUtil.generateRand(10);

        ArrayUtil.show(array1);
        ArrayUtil.show(array2);

        for (int i = 0; i < array1.length; i++) {
            int t = array1[i];
            array1[i] = array2[i];
            array2[i] = t;
        }

        ArrayUtil.show(array1);
        ArrayUtil.show(array2);
    }
}
