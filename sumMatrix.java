import java.util.Random;
import java.util.Arrays;

public class sumMatrix {
    public static void main(String[] args) {
        Random ran = new Random();
        int[][] matrice = Array[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrice[i][j] = ran.nextInt(10);
            }
        }

        int sumLine = 0;
        int sumCol = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sumLine += matrice[i][j];
                sumCol += matrice[j][i];
            }
        }
    }
}
