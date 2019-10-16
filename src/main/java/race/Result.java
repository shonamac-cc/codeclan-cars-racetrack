package race;

public class Result {

    private String name;
    private int number;
    private int score;
    private boolean damaged;

    public Result(String name, int number, int score, boolean damaged){
        this.name = name;
        this.number = number;
        this.score = score;
        this.damaged = damaged;
    }

    public String getResultString() {
        String damageText = damaged ? "They were damaged in the race and forced to pit." : "They had a clean race.";
        return (String.format("%s driving car number %d scored %d! %s", name, number, score, damageText));
    }
}
