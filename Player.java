package basketballGame;

public class Player {
    private String name;
    private int shooting;
    private int dribbling;
    private int passing;
    private int fatigue;

    // constructor
    public Player(String name) {
        this.name = name;
        this.shooting = 50;
        this.dribbling = 50;
        this.passing = 50;
        this.fatigue = 0;
    }

    // training methods
    public void practiceShooting() {
        shooting += 5;
        fatigue += 10;
    }

    public void practiceDribbling() {
        dribbling += 5;
        fatigue += 10;
    }

    public void practicePassing() {
        passing += 5;
        fatigue += 10;
    }

    // getters and setters
    public int getShooting() { return shooting; }
    public int getDribbling() { return dribbling; }
    public int getPassing() { return passing; }
    public int getFatigue() { return fatigue; }
    public void setShooting(int shooting) { this.shooting = shooting; }
    public void setDribbling(int dribbling) { this.dribbling = dribbling; }
    public void setPassing(int passing) { this.passing = passing; }
    public void setFatigue(int fatigue) { this.fatigue = fatigue; }
    public String getName() {
        return name;
    }
}