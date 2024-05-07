public abstract class Grundstück extends Feld {

    private final int wert;

    public Grundstück(String name, int nummer, int wert) {
        super(name, nummer);
        this.wert = wert;
    }

    public int getWert(){
        return wert;
    }
}
