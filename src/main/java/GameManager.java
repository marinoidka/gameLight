import pro.learnup.javaqa.group2.chernykh3.Game;
import pro.learnup.javaqa.group2.chernykh3.Movable;

public class GameManager {

    private Game manager;
    private boolean isGreenLight;

    public GameManager(Game manager) {
        this.manager = manager;
        this.isGreenLight = manager.isGreenLight;
    }

    public int getRounds(int[] playerSpeeds) {
        int k = 0;
        for (int speed : playerSpeeds) {
            if (manager.isFailed(speed, isGreenLight) == false) {
                k++;
            }
        }
        return k;
    }

    public int loser(Movable p1, Movable p2, int
            rounds) {
        int p1Rounds = 0;
        int p2Rounds = 0;
        int cnt =0;
        for (int i = 0; i < rounds; i++) {
            if (!manager.isFailed(p1.getSpeed(), isGreenLight)) {
                p1Rounds++;
            }
            if (!manager.isFailed(p2.getSpeed(), isGreenLight)) {
                p2Rounds++;
            }
        }
        if (p1Rounds < p2Rounds) {
            cnt = -1;
        }
        if (p2Rounds < p1Rounds) {
            cnt = 1;
        }
        if (p1Rounds == p2Rounds) {
            cnt = 0;
        }

        return cnt;
    }


}
