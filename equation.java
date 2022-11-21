public class equation {
    public static void main(String[] args) {
        equationSolver(7, -9, 2);
    }

    static void equationSolver(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double res1 = (-b + Math.sqrt(delta)) / (2 * a);
            double res2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("results are: " + res1 + " & " + res2);
        } else if (delta == 0) {
            double res1 = (-b + Math.sqrt(delta) / (2 * a));
            System.out.println("result is: " + res1);
        } else {
            System.out.println("no results");
        }
    }
}
