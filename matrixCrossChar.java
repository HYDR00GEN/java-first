public class matrixCrossChar {
    public static void main(String[] args) {
        printMatrix(4, 'F');
    }

    public static void printMatrix(int size, char sign) {
        char[][] matrice = new char[size][size];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {

                if (i == j || i + j == matrice.length - 1) {
                    matrice[i][j] = sign;
                } else {
                    matrice[i][j] = '0';
                }
            }
        }
        System.out.println("");
    }
}
