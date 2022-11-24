import java.util.Arrays;

public class ContoCorrente {

    // Attributi
    private int codice;
    private Persona intestatario;
    private double saldo;
    private int numeroMovimenti;
    private Movimento[] movimenti;

    // Costruttore
    public ContoCorrente(int codice, Persona intestatario) {
        this.codice = codice;
        this.intestatario = intestatario;
        this.saldo = 0;
        this.numeroMovimenti = 0;
        this.movimenti = new Movimento[];
    }

    // Metodi
    public void deposita(int importo) {
        this.saldo += importo;
        this.numeroMovimenti++;

    }

    public void preleva(int importo) {
        this.saldo -= importo;
        this.numeroMovimenti++;

    }

    // Getters
    public double getSaldo() {
        return this.saldo;
    }

    public int getCodice() {
        return this.codice;
    }

    public String getIntestatario() {
        return this.intestatario;
    }

    public int getNumeroMovimenti() {
        return this.numeroMovimenti;
    }

    public String getListaMovimenti() {
        return Arrays.toString(movimenti);
    }
    // Setters

    // public void setIntestatario(String intestatario) {
    // this.intestatario = intestatario;
    // }
}