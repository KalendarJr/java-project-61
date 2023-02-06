package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static int numberQuestion = 3;
    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void gameEven() {
        String[][] gameData = new String[numberQuestion][2];

        for (int i = 0; i < Engine.maxRounds; i++) {
            int randomNumber = Engine.getRandomNumber(Engine.maxNumber);
            gameData[i][0] = Integer.toString(randomNumber);
            gameData[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        String taskGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.playGame(gameData, taskGame);
    }
}
