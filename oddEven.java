import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert nr to find if it's Odd or Even: ");
        int nr = input.nextInt();
        input.close();

        isOddEven(nr);
    }

    public static void isOddEven(int nr) {
        if (nr % 2 == 0) {
            System.out.println(nr + " is EVEN");
        } else {
            System.out.println(nr + " is ODD");
        }
    }
}
