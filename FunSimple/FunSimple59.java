package FunSimple;

public class FunSimple59 {
    public static void main(String[] args) {
        System.out.println(dist(-5, 5, 7, 7, 3, 5.5));
    }

    /*
     * a = |AB| = sqrt((Xa-Xb)^2+(Ya-Yb)^2);
     * b = |BP| = sqrt((Xp-Xb)^2+(Yp-Yb)^2);
     * c = |AP| = sqrt((Xa-Xp)^2+(Ya-Yp)^2);
     * 
     * p = (a+b+c)/2;
     * S = sqrt(p*(p-a)*(p-b)*(p-c));
     * 
     * h = 2*S/a;
     */
    public static double dist(double xa, double ya, double xb, double yb, double xp, double yp) {
        double h, a, b, c, s, p;
        a = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
        b = Math.sqrt((xp - xb) * (xp - xb) + (yp - yb) * (yp - yb));
        c = Math.sqrt((xa - xp) * (xa - xp) + (ya - yp) * (ya - yp));
        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        h = 2 * s / a;
        return h;
    }
}
