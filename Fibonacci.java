public class Fibonacci {
    public static void main(String[] args) {
        int primo = 0;
        int secondo = 1;
        int giri = 5;

        for (int i = 1; i <= giri; i++) {
            System.out.print(primo + " ");

            int nuovo = primo + secondo;
            primo = secondo;
            secondo = nuovo;
        }
    }
}