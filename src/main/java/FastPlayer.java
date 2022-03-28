import pro.learnup.javaqa.group2.chernykh3.Movable;

public class FastPlayer implements Movable {
    int startSpeed;
    int speedStep;

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;
    }

    @Override
    public int getSpeed() {
        startSpeed = startSpeed + speedStep;
        return startSpeed;
    }
}
