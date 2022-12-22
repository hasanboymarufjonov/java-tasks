// 76

public class Exam5 {
    public static void main(String[] args) {
        System.out.println(input(40, 56));
    }

    public static int input(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b)
            a = a % b;
        else
            b = b % a;
        return input(a, b);
    }
}
