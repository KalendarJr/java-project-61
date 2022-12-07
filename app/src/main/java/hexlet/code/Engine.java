package hexlet.code;

import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int oneNumber = RandomUtils.nextInt(2, 10);
    public static int twoNumber = RandomUtils.nextInt(3, 10);
    public static int threeNumber = RandomUtils.nextInt(1, 11);
    public static int progressionOneNumber = RandomUtils.nextInt(20, 28);
    public static int progressionTwoNumber = RandomUtils.nextInt(20, 35);
    public static int progressionThreeNumber = RandomUtils.nextInt(30, 50);
    public static Random numberRandom = new Random();
    public static int numberOne = numberRandom.nextInt(20);
    public static int numberTwo = numberRandom.nextInt(16);
    public static int resultOneNumber = oneNumber + 8;
    public static int resultTwoNumber = twoNumber + 6;
    public static int resultThreeNumber = threeNumber + 15;
    public static int numberThree = numberRandom.nextInt(50);
    public static int numberFour = numberRandom.nextInt(50);
    public static int numberFive = numberRandom.nextInt(50);
    public static int numberSix = numberRandom.nextInt(500);
    public static int resultOne = numberOne * numberTwo;
    public static int resultTwo = numberThree + numberFour;
    public static int resultThree = numberFive - numberSix;
    public static int resultFour = numberTwo - 2;

    public static String question = "Question: ";
//    public static String yourAnswer = "Your answer: ";
    public static String letsTry = "Let's try again, ";
    public static String isWrong = " is wrong answer ;(. Correct answer was '";
//    public static String questionEven = "Answer 'yes' if the number is even, otherwise answer 'no'.";
//    public static String questionCalc = "What is the result of the expression?";
//    public static String questionGCD = "Find the greatest common divisor of given numbers.";
    public static String questionProgression = "What number is missing in the progression?";


    public static void welcomeUser() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
    }
    public static String nameUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
     }

    public static String answerUserString() {
        Scanner scanner = new Scanner(System.in);
        String answerString = scanner.next();
        return answerString;
    }

     public static int answerUser() {
         Scanner scanner = new Scanner(System.in);
         int answer = scanner.nextInt();
         return answer;
     }

     public static void progressionOne() {
          for (var i = oneNumber; i < progressionOneNumber; i+=2) {
              if(i == resultOneNumber) {
                  System.out.print(".. ");
                  continue;
              }
              System.out.print(i + " ");
          }
         System.out.println();
         System.out.print("Your answer: ");
     }

    public static void progressionTwo() {
        for (var i = twoNumber; i < progressionTwoNumber; i+=3) {
            if(i == resultTwoNumber) {
                System.out.print(".. ");
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Your answer: ");
    }

    public static void progressionThree() {
        for (var i = threeNumber; i < progressionThreeNumber; i+=5) {
            if(i == resultThreeNumber) {
                System.out.print(".. ");
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Your answer: ");
    }
}
