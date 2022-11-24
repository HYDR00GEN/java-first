public class TestLampadina {
    public static void main(String[] args) {
        Lampadina x = new Lampadina(46464, 3);
        Interruttore i = new Interruttore(x, "test");
        Interruttore j = new Interruttore(x, "second");

        i.getLampCodefromSwitch();
        j.getLampCodefromSwitch();

        i.clicker();
        x.stato();

        j.clicker();
        x.stato();
    }
}
