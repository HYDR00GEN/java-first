public class Lampadina {
    // attributi
    private int code;
    private int clickMax;
    private int counter;
    private String status;

    // costruttore
    public Lampadina(int code, int clickMax) {
        this.code = code;
        this.counter = 0;
        this.clickMax = clickMax;
        this.status = "spenta";
    }

    // metodi
    public void click() {
        counter++;
        if (status.equals("spenta")) {
            this.status = "accesa";
        } else if (this.counter > clickMax) {
            this.status = "broken";
        } else {
            this.status = "spenta";
        }
    }

    public int getLampCode() {
        return this.code;
    }

    public String stato() {
        String recap = "Stato: " + this.status + " | clicked: " + this.counter;
        System.out.println(recap);
        return recap;
    }
}
