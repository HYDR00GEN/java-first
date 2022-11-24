import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Persona marius = new Persona("Marius", "Borg", 18);
        Movimento m = new Movimento();
        ContoCorrente c1 = new ContoCorrente(123, marius);

        System.out.println(c1.getListaMovimenti());
    }

}
