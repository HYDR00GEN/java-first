import java.util.Scanner;

public class descr {
    public static void main(String[] args) {
        descending();
    }

    public static void descending() {

        boolean flag = true;
        while (flag) {
            Scanner input = new Scanner(System.in);
            System.out.println("Insert nr with 5 digits: ");
            int nr = input.nextInt();
            input.close();
            if (9999 < nr && nr < 100000) {
                flag = false;
                for (int i = nr; i >= 150; i = i - 2) {
                    System.out.print(i + " ");
                }
            } else {
                System.out.print("not a 5 digits number");
            }
        }
    }

}
