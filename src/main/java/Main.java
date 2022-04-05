import java.util.Arrays;
import pro.learnup.javaqa.group2.chernykh3.Game;
import pro.learnup.javaqa.group2.chernykh3.Movable;
import pro.learnup.javaqa.group2.chernykh3.Statistics;

public class Main {

    public static void main(String[] args) {

        int[] speeds = {9, 6, 0, 10, 8};
        String[] playersName = {"Nick 9", "Leo 6", "Chris 0", "Alex 10", "Jen 8"};
        int[] playerSpeeds = {0, 0, 0, 12, 8, 0, 2};

        Statistics statistics = new Statistics(true);
        statistics.maxSpeed = 7;

        Game game = new Game (true);

        SpeedyGame speedyGame = new SpeedyGame(7, true);
        speedyGame.setLight(true);

        Game game1 = new Game(game.isGreenLight);

        game1.setLight(false);
        game1.setMaxSpeed(0);
        GameManager player1 = new GameManager(game1);
        player1.getRounds(playerSpeeds);

        FastPlayer player = new FastPlayer(10, 5);

        System.out.println();


        System.out.println("Количество выбывших игроков: " + statistics.droppedOut(speeds));
        System.out.println("Скорость выбывших игроков: " + Arrays.toString(statistics.speedDroppedOut(speeds)));
        System.out.println("Скорость выживших игроков: " + Arrays.toString(statistics.speedStayedIn(speeds)));
        System.out.println("Имена выживших игроков: " +  Arrays.toString(statistics.survivors(playersName)));

        System.out.println("Проиграл ли игрок?: " + game.isFailed(5, true));
        System.out.println("Проиграл ли игрок?: " + speedyGame.isFailed(5, true));

        System.out.println("Игрок продержался: " + player1.getRounds(playerSpeeds) + " раундов");

        System.out.println("Новая скорость игрока FastPlayer: " + player.getSpeed());
        System.out.println("Новая скорость игрока FastPlayer: " + player.getSpeed());
        System.out.println("Новая скорость игрока FastPlayer: " + player.getSpeed());
        System.out.println("Новая скорость игрока FastPlayer: " + player.getSpeed());

        Movable p1 = new FastPlayer(1, 1);
        Movable p2 = new ConstantPlayer();
        GameManager manager = new GameManager(game);

        System.out.println("Метод loser возвращает: " + manager.loser(p1, p2, 10));


    }

}
