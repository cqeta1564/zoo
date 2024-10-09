import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        // skupina a
        Zoo zoo = new Zoo("reznictvi Tintera");

        System.out.println(zoo.pridatChovatele("Pepa", 1234, 960));
        System.out.println(zoo.pridatChovatele("Jindra", 6666, 1200));

        System.out.println(zoo.pridatZvire("Lachtan", 250, 1, 50, true)); //Druh, kg, m, kg, bool
        System.out.println(zoo.pridatZvire("Kapybara", 15, 1, 2, false)); //Druh, kg, m, kg, bool
        System.out.println(zoo.pridatZvire("Slon", 1500, 15, 150, true)); //Druh, kg, m, kg, bool

        System.out.println(zoo.pridatZvireChovaleli(1234, "Lachtan"));
        System.out.println(zoo.pridatZvireChovaleli(1234, "Kapybara"));


        System.out.println(zoo.pocetZvirat());
        System.out.println(zoo.celkovaSpotrebaPotravy());
        System.out.println(zoo.naklady());
        System.out.println(zoo.zvirataPodleVelikosti());
        System.out.println(zoo.zvirataCovatele(1234));}
}