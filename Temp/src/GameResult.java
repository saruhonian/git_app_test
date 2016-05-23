import java.util.Date;

public class GameResult {

    private Player player;
    private String result;
    private Date date;

    public GameResult(Player player, String result) {
        this.player = player;
        this.result = result;
        this.date = new Date();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != GameResult.class) {
            return false;
        }
        GameResult gameResult = (GameResult) obj;
        if (this.player == null ||
                this.result == null) {
            return false;
        }
        if (this.player.equals(gameResult.player) &&
                this.result.equals(gameResult.result)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return player.getType() + result;
    }
}