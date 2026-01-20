package sorting.gamerzone;

public class Player {
    int playerId;
    String name;
    int score;

    public Player(int playerId, String name, int score) {
        this.playerId = playerId;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return playerId + " | " + name + " | Score: " + score;
    }
}
