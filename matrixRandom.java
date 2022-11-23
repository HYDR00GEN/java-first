import java.util.Random;

class Test {
    public static void main(String[] args) {

        Random randomico = new Random();
        int dimensione = randomico.nextInt(10) + 1;
        int[][] matrice = new int[dimensione][dimensione];

        int somma = 0;
        for (int i = 0; i < dimensione; i++) {
            for (int j = 0; j < dimensione; j++) {
                int valore = randomico.nextInt(10);
                somma += valore;
                matrice[i][j] = valore;
            }
        }
        int media = somma / (dimensione * dimensione);

        int[] maggioriMedia = new int[dimensione * dimensione];
        int y = 0;
        for (int i = 0; i < dimensione; i++) {
            for (int j = 0; j < dimensione; j++) {
                if (matrice[i][j] > media) {
                    maggioriMedia[y] = matrice[i][j];
                    y++;
                }
            }
        }

        int newDim;
        double radice = Math.sqrt(dimensione);
        if ((radice % Math.round(radice)) > 0) {
            newDim = (int) Math.round(radice) + 1;
        } else {
            newDim = (int) Math.round(radice);
        }
        int[][] risultato = new int[newDim][newDim];

        y = 0;
        for (int i = 0; i < newDim; i++) {
            for (int j = 0; j < newDim; j++) {

                if (y < maggioriMedia.length) {
                    risultato[i][j] = maggioriMedia[y];
                    y++;
                } else {
                    risultato[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < newDim; i++) {
            for (int j = 0; j < newDim; j++) {
                System.out.print(risultato[i][j] + " ");
            }
            System.out.println();
        }

    }
}
