package FunSimple;

public class FunSimple16 {
    public static void main(String[] args) {
        // Scanner code = new Scanner(System.in);
        System.out.println(ishora(45));
        System.out.println(ishora(-12));
        System.out.println(ishora(0));
        System.out.println(ishora(8) + ishora(7));

    }

    static int ishora(int a) {
        if (a > 0)
            return 1;
        else if (a < 0)
            return -1;
        else
            return 0;
    }
}
