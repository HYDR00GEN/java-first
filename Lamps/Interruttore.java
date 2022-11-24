public class Interruttore {
    // attributi
    private Lampadina lamp;
    private String model;
    private boolean ON;

    // costruttore
    public Interruttore(Lampadina lamp, String model) {
        this.model = model;
        this.lamp = lamp;
    }

    // metodi
    public int getLampCodefromSwitch() {
        int res = this.lamp.getLampCode();
        System.out.print("Lamp has code: " + res + "\n");
        return res;
    }

    public void clicker() {
        lamp.click();
        lamp.stato();
    }

}
