import pro.learnup.javaqa.group2.chernykh3.Movable;

public class ConstantPlayer implements Movable {
    public int speed;

    public ConstantPlayer() {
        this.speed = 6;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
