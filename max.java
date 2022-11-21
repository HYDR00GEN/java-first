public class max {
    public static void main(String[] args) {
        maxNumber(3, 8);
        maxNumber(9, 8);
        maxNumber(-3, -1);
        maxNumber(-12, 58);
    }

    static void maxNumber(int a, int b) {
        if (a < b) {
            System.out.println(b);
        } else if (a > b) {
            System.out.println(a);
        } else {
            System.out.println("error");
        }
    }
}
