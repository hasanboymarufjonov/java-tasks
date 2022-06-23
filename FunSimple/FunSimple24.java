package FunSimple;

public class FunSimple24 {
  public static void main(String[] args) {
    event(21);
    event(8);
    event(13);
  }

  static void event(int a) {
    if (a % 2 == 0)
      System.out.println(true);
    else
      System.out.println(false);
  }
}
