package pro.learnup.javaqa.group2.chernykh3;

public class Game {
    public boolean isGreenLight;
    private int maxSpeed;

    public Game(boolean isGreenLight) {

        this.isGreenLight = isGreenLight;
    }

    public boolean getLight() {
        return isGreenLight;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setLight(boolean IsGreenLight) {
        this.isGreenLight = IsGreenLight;
    }

    public boolean isFailed(int speed, boolean isGreenLight) {
        if (!isGreenLight) {
            return speed > maxSpeed;
        } else return false;
    }
}
