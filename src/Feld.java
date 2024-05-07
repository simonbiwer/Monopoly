public abstract class Feld {
    private final String name;
    private final int nummer;

    public Feld(String name, int nummer){
        this.name = name;
        this.nummer = nummer;
    }

    public String getName(){
        return name;
    }
    public int getNummer(){
        return nummer;
    }
}
