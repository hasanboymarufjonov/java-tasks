package FunSimple;

public class FunSimple35 {
  public static void main(String[] args) {
    System.out.println(fact2(6) == 48);
    System.out.println(fact2(8) == 384);
    System.out.println(fact2(11) == 10395);
  }

  static int fact2(int n) {
    int fact = 1;
    while (n >= 1) {
      fact = fact * n;
      n -= 2;

    }

    return fact;
  }
}
