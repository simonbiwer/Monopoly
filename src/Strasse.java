import java.util.Arrays;

public class Strasse extends Grundstück {

    private Spieler besitzer;
    private final int[] mieten;     //Problem Liste mit übergeben von Häuser 0 bis 5 und Problem doppelte Miete wenn alle Strassen einer Farbe besessen werden
    private int hauskosten = 50;
    private int hausanzahl;

    public Strasse(String name, int nummer, int wert, int[] mieten ) {
        super(name, nummer, wert);
        besitzer = null;
        if (nummer > 10 & nummer < 20){
            hauskosten = 100;
        }
        if (nummer > 20 & nummer < 30){
            hauskosten = 150;
        }
        if (nummer > 30 & nummer < 40){
            hauskosten = 200;
        }
        this.mieten = mieten;
        hausanzahl = 0;
    }

    public Spieler getBesitzer(){
        return besitzer;
    }
    public int getHypowert(){
        return super.getWert()/2;
    }
    public int getMiete(){
        return mieten[hausanzahl];
    }
    public int getHauskosten(){
        return hauskosten;
    }
    public int getHausanzahl(){
        return hausanzahl;
    }
    public void setBesitzer(Spieler s){
        besitzer = s;
    }
    public void hausBauen(){
        ++hausanzahl;
    }

    @Override
    public String toString() {
        return "Strasse{" +
                "besitzer=" + besitzer +
                ", mieten=" + Arrays.toString(mieten) +
                ", hauskosten=" + hauskosten +
                ", hausanzahl=" + hausanzahl +
                '}';
    }
}
