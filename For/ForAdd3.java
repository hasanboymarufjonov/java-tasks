package For;

// N natural sonining mukammal yoki mukammal emasligini aniqlovchi programma tuzilsin
// O'zidan boshqa bo'luvchilar yig'indisiga teng bo'lgan son mukammal son deyiladi

public class ForAdd3 {
    public static void main(String[] args) {
        input(6);
    }

    public static void input(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count += i;
            }
        }
        if (N == count) {
            System.out.println("Mukammal son");
        } else {
            System.out.println("Mukammal son emas");
        }
        System.out.println(count);
    }
}
