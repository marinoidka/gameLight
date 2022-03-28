package pro.learnup.javaqa.group2.chernykh3;

public class Game {
    public boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getLight () {
        return isGreenLight;
    }

    public void setLight(boolean IsGreenLight) {
        this.isGreenLight = IsGreenLight;
    }

    public boolean isFailed(int speed, boolean isGreenLight) {
        if(!isGreenLight) {
            return speed > 0;
        } else return false;
    }
}
