package Lesson17;

public class Array18 {

    public static void main(String[] args) {
        System.out.println(func());
    }

    public static int func() {
        int array[] = { 123, 13, 24, 64 };
        int last = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < last) {
                return array[i];
            }
        }
        return 0;
    }

}
