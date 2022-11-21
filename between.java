public class between {
    public static void main(String[] args) {
        isBetween(1, 88, 3);
    }

    public static void isBetween(int a, int b, int c) {
        if (a < b && b < c) {
            System.out.println(b + " is between " + a + " & " + c);
        } else {
            System.out.println(b + " is NOT between " + a + " & " + c);
        }
    }
}
