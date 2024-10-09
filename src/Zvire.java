public class Zvire implements Comparable<Zvire> {

    private String druh;
    private int hmotnost;
    private int vyska;
    private int potrava;
    private boolean pavilon;

    public Zvire(String druh, int hmotnost, int vyska, int potrava, boolean pavilon) {
        this.druh = druh;
        this.hmotnost = hmotnost;
        this.vyska = vyska;
        this.potrava = potrava;
        this.pavilon = pavilon;
    }

    public int getPotrava() {
        return potrava;
    }

    public String getDruh() {
        return druh;
    }

    @Override
    public int compareTo(Zvire o) {
        return Integer.compare(this.potrava, o.potrava);
    }

    @Override
    public String toString() {
        return "Zvire{" +
                "druh='" + druh + '\'' +
                ", hmotnost=" + hmotnost +
                ", vyska=" + vyska +
                ", potrava=" + potrava +
                ", pavilon=" + pavilon +
                '}';
    }
}
