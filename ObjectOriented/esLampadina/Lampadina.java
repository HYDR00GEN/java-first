package esLampadina;

public class Lampadina {
    // attributi
    private int clickMax;
    private int counter;
    private String status;

    // costruttore
    public Lampadina(int clickMax) {
        this.counter = 0;
        this.clickMax = clickMax;
        this.status = "spenta";
    }

    // metodi
    public void click() {
        counter++;
        if (status.equals("spenta")) {
            this.status = "accesa";
        } else {
            this.status = "spenta";
        }
    }

    public boolean stato() {
        return System.out.println(status);
    }
}
