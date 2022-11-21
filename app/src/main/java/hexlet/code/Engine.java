package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static Random numberRandom = new Random();
    public static int numberOne = numberRandom.nextInt(20);
    public static int numberTwo = numberRandom.nextInt(10);
    public static int numberThree = numberRandom.nextInt(50);
    public static int numberFour = numberRandom.nextInt(50);
    public static int numberFive = numberRandom.nextInt(50);
    public static int numberSix = numberRandom.nextInt(500);
    public static int resultOne = numberOne * numberTwo;
    public static int resultTwo = numberThree + numberFour;
    public static int resultThree = numberFive - numberSix;

      public static String nameUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
     }

    public static String answerUserString() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        return answer;
    }

     public static int answerUser() {
         Scanner scanner = new Scanner(System.in);
         int answer = scanner.nextInt();
         return answer;
     }

    public static int randomMap(int numberOne1) {
        Random numberRandom = new Random();
        int numberOne = numberRandom.nextInt(20);
        int numberTwo = numberRandom.nextInt(10);
        int numberThree = numberRandom.nextInt(50);
        int numberFour = numberRandom.nextInt(50);
        int numberFive = numberRandom.nextInt(50);
        int numberSix = numberRandom.nextInt(500);
        int resultOne = numberOne * numberTwo;
        int resultTwo = numberThree + numberFour;
        int resultThree = numberFive - numberSix;

        return numberOne1;
    }
}
