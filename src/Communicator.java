import java.util.Scanner;

public class Communicator {

    public static boolean ask(String question){
        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        if (sc.next().equals("j")){
            sc.close();
            return true;
        }
        return false;           //theoretisch alle anderen Eingaben dann false aber in der Praxis "n"
    }
}
