package Boolean;

public class BooleanAdd1 {
    public static void main(String[] args) {
        boolean a, b, c, d, result;
        a = true;
        b = false;
        c = true;
        d = false;

        result = (a && b) || (c && d) && (a || b);
        System.out.println(result);
    }
}
