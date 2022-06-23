package FunSimple;

public class FunSimple19 {
    public static void main(String[] args) {
        System.out.println(ringS(5, 7));
        System.out.println(ringS(10, 7));
        System.out.println(ringS(8, 5));
        System.out.println(ringS(3, 9));
    }

    static double ringS(double a, double b) {
        double s1, s2, s;
        s1 = 3.14 * a * a;
        s2 = 3.14 * b * b;
        if (s1 > s2)
            s = s1 - s2;
        else
            s = s2 - s1;
        return s;
    }
}
