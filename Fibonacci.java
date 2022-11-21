public class Fibonacci {
    public static void main(String[] args) {
        int primo = 0;
        int secondo = 1;
        int giri = 12;

        for (int i = 1; i <= giri; i++) {
            System.out.println(primo + " giro n." + i);

            int nuovo = primo + secondo;
            primo = secondo;
            secondo = nuovo;
        }
    }
}

// out : 0 1 1 2