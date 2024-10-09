import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Zoo {

    private String nazev;
    private ArrayList<Zvire> zvirata;
    private ArrayList<Chovatel> chovatele;

    public Zoo(String nazev) {
        this.nazev = nazev;
        this.zvirata = new ArrayList<>();
        this.chovatele = new ArrayList<>();
    }

    public String pridatZvire(String druh, int hmotnost, int vyska, int potrava, boolean pavilon) {
        zvirata.add(new Zvire(druh, hmotnost, vyska, potrava, pavilon));
        return "Zvire uspesne pridano";
    }

    public int pocetZvirat() {
        return zvirata.size();
    }

    public int celkovaSpotrebaPotravy() {
        int soucet = 0;
        for (int i = 0; i < zvirata.size(); i++) {
            soucet += zvirata.get(i).getPotrava();
        }
        return soucet;
    }

    public int naklady() {
        int soucet = 0;
        soucet += zvirata.size() * 300;
        for (int i = 0; i < chovatele.size(); i++) {
            soucet += chovatele.get(i).getPlat();
        }
        return soucet;
    }

    public String zvirataPodleVelikosti() {
        Collections.sort(zvirata);
        return zvirata.toString();
    }

    public String zvirataCovatele(int idCovatele) {
        for (int i = 0; i < chovatele.size(); i++) {
            if (chovatele.get(i).getId() == idCovatele) {
                return chovatele.get(i).getZvirata();
            }
        }
        return "Chovatel nenalezen";
    }

    public String pridatChovatele(String jmeno, int id, int plat) {
        chovatele.add(new Chovatel(jmeno, id, plat));
        return "Chovatel uspesne pridan";
    }

    public String pridatZvireChovaleli(int idCovatele, String druh) {
        for (int i = 0; i < chovatele.size(); i++) {
            if (chovatele.get(i).getId() == idCovatele) {
                for (int j = 0; j < zvirata.size(); j++) {
                    if (Objects.equals(zvirata.get(j).getDruh(), druh)) {
                        return chovatele.get(i).pridatZvire(zvirata.get(j));
                    }
                }
                return "Zvire nenalezeno";
            }
        }
        return "Chovatel nenalezen";
    }
}
