import java.util.ArrayList;

public class Chovatel {

    private String jmeno;
    private int id;
    private int plat;
    private ArrayList<Zvire> zvirata;

    public Chovatel(String jmeno, int id, int plat) {
        this.jmeno = jmeno;
        this.id = id;
        this.plat = plat;
        this.zvirata = new ArrayList<>();
    }

    public String pridatZvire(Zvire zvire) {
        zvirata.add(zvire);
        return "Zvire bylo uspesne pridano k chovateli";
    }

    public String getZvirata() {
        return zvirata.toString();
    }

    public int getPlat() {
        return plat;
    }

    public int getId() {
        return id;
    }
}
