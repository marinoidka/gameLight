import pro.learnup.javaqa.group2.chernykh3.Game;

public class SpeedyGame extends Game {
    public int maxSpeed;

    public SpeedyGame(int maxSpeed, boolean isGreenLight) {
        super(isGreenLight);
        this.maxSpeed = maxSpeed;
    }

    public boolean getLight () {
        return isGreenLight;
    }

    public void setLight(boolean IsGreenLight) {
        this.isGreenLight = IsGreenLight;
    }

    @Override
    public boolean isFailed(int speed, boolean isGreenLight) {
        if(!isGreenLight) {
            return speed > maxSpeed;
        } else return false;
    }
}
