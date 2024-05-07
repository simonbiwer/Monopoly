import java.util.Random;
import java.util.Scanner;

public class Spieler {

    private final String name;
    private double budget;
    private int standort;
//    private final int nummer;

    public Spieler (String name){
        this.name = name;
        budget = 1500.0;
        standort = 0;
    }

    public String getName(){
        return name;
    }
    public double getBudget() {
        return budget;
    }
    private int getStandort() {
        return standort;
    }
    private void aendereBudget(double e){        //Methodenname?
        budget = budget + e;
    }
    private void gehe(int a){
        standort = standort + a;
    }

    public void spielzug(){                     //Spielzug wird eigenes Objekt/Klasse? Spielzug arbeitet mit Spielern oder Spieler können Spielzug?
        if (Communicator.ask("Würfeln?")){
            System.out.println(wuerfeln());
        }

    }

    private int wuerfeln(){                 // Pasch fehlt noch -> zwei einzelne Würfel
        Random random = new Random();
        return random.nextInt(11) + 1;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", standort=" + standort +
                '}';
    }
}
