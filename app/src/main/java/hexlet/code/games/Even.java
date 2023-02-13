package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }
    private static final String TASK_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startEvenGame() {
        String[][] gameData = new String[Engine.NUMBER_QUESTION][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int randomNumber = Engine.getRandomNumber(Engine.MAX_NUMBER);
            gameData[i][0] = Integer.toString(randomNumber);
            gameData[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.playGame(gameData, TASK_GAME);
    }
}
