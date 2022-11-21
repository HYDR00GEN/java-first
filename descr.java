import java.util.Scanner;

public class descr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insert nr with max 5 digits: ");
        int nr = input.nextInt();
        input.close();

        descending(nr);
    }

    public static void descending(int nr) {

        int length = (int) Math.log10(nr) + 1;
        if (length <= 5) {
            while (nr > 150) {
                nr -= 2;
                System.out.println(nr);
            }
        } else {
            System.out.println("number too big");
        }
    }
}
