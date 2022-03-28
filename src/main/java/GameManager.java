import pro.learnup.javaqa.group2.chernykh3.Game;
import pro.learnup.javaqa.group2.chernykh3.Movable;

public class GameManager extends SpeedyGame {

    public Game manager;

    public GameManager(int maxSpeed, boolean isGreenLight, Game manager) {
        super(maxSpeed, isGreenLight);
        this.manager = manager;
    }

    @Override
    public boolean isFailed(int speed, boolean isGreenLight) {
        if (!isGreenLight) {
            return speed > maxSpeed;
        } else return false;
    }


    public int getRounds(int[] playerSpeeds) {
        int k = 0;
        for (int speed : playerSpeeds) {
            if (isFailed(speed, isGreenLight) == false) {
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
            if (!isFailed(p1.getSpeed(), isGreenLight)) {
                p1Rounds++;
            }
            if (!isFailed(p2.getSpeed(), isGreenLight)) {
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
