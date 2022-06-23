package FunSimple;

public class FunSimple26 {
    public static void main(String[] args) {
        System.out.println(ispower5(125));
        System.out.println(ispower5(25));
        System.out.println(ispower5(625));
        System.out.println(ispower5(36));
        System.out.println(ispower5(45));
    }

    static boolean ispower5(int a) {
        int k = 1;
        do {
            k *= 5;
        } while (k < a);
        if (k == a)
            return true;
        else
            return false;
    }
}
