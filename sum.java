import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        getSum();
    }

    public static void getSum() {

        System.out.println("Get sum of any numbers inserted inline.");
        Scanner input = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;

        System.out.println("insert numbers here: ");
        String line = input.nextLine();

        input = new Scanner(line);
        while (input.hasNextInt()) {
            numbers = input.nextInt();
            sum += numbers;
        }
        System.out.println("Your sum is: " + sum);

    }
}
