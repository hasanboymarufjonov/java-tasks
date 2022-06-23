package FunSimple;

public class FunSimple22 {
    public static void main(String[] args) {
        calc(4, 5, 1);
        calc(9, 5, 2);
        calc(7, 3, 3);
        calc(28, 14, 4);
        calc(28, 14, 5);
    }

    static void calc(double a, double b, double c) {
        switch ((int) c) {
            case 1:
                System.out.println(a - b);
                break;
            case 2:
                System.out.println(a + b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("4 arifmetik amal bajariladi");
        }

    }
}
