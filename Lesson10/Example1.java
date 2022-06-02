package Lesson10;

public class Example1 {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 10) {
                break;
            }
        }
    }
}
