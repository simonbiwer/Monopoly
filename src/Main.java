import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    // Vor dem Spiel

        String[] spielerliste = {"Simon", "Marven"};               //hier müssen Namen der Spieler eingegeben werden
        Ringpuffer<Spieler> spieler = new Ringpuffer<>(6);                        //Spieler erstellen (max. 6)
        for (String name : spielerliste){
            spieler.add(new Spieler(name));
        }
        Iterator<Spieler> players = spieler.iterator();
        Spielfeld spielfeld = new Spielfeld();                     //Spielfeld erstellen

    //Start des Spiels

        if (Communicator.ask("Spiel starten?")){
            while(players.hasNext()){                       //Endlosschleife!!! das eigentliche Spiel
                players.next().spielzug();
            }
        }
    }
}
