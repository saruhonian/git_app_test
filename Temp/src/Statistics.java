import java.util.ArrayList;
import java.util.List;

public class Statistics {

    private List<GameResult> results = new ArrayList<GameResult>();

    public void addResult(GameResult result) {
        results.add(result);
    }

    @Override
    public String toString() {
        String statistics = "";
        for (GameResult result : results) {
            statistics += result;
        }
        return statistics;
    }

    private static Statistics instance;

    private Statistics() {

    }

    public static Statistics getInstance() {
        if (instance == null) {
            instance = new Statistics();
        }
        return instance;
    }
}