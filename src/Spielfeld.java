public class Spielfeld {
    private Ringpuffer<Feld> felder;     //Spielfeld Ringpuffer als Array, damit man gut induziert zugreifen kann

    public Spielfeld(){
        felder = new Ringpuffer<>(36);      //normales Monopoly hat 36 Felder
        initialise();
    }

    private void initialise(){
        //erzeuge Instanzen aller Felder und füge sie hinzu

        int[] mieten1 = new int[]{2,10,20,30,40,50};
        Strasse krahnenufer = new Strasse("Krahnenufer", 1, 40, mieten1);
        felder.add(krahnenufer);
    }
}
