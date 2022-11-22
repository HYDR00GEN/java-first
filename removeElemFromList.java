import java.util.Arrays;

public class removeElemFromList {
    public static void main(String[] args) {

        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // removeElement(lista, 4);
        // removeElement(lista, 0);
        System.out.println(Arrays.toString(lista));
        removeElement(lista, 4);
        System.out.println(Arrays.toString(lista));
        // removeElement(lista, 10);

    }

    public static int[] removeElement(int[] lista, int pos) {
        if (pos >= lista.length || pos < 0) {
            int[] back = new int[lista.length];
            for (int i = 0; i < lista.length; i++) {
                back[i] = -1;
            }
            return back;
        } else {
            int j = 0;
            int[] back = new int[lista.length - 1];
            for (int i = 0; i < lista.length; i++) {
                if (pos == i) {

                } else {
                    back[j] = lista[i];
                    j++;
                }
            }
            return back;
        }
    }
}
