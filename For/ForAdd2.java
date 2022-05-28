package For;

// N natural soni bo'luvchilari yig'indisini chiqaruvchi dastur tuzilsin

public class ForAdd2 {
    public static void main(String[] args) {
        input(15);
    }

    public static void input(int N) {
        int count = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {

                count += i;

            }
        }
        System.out.println(count);
    }
}
