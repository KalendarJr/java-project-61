package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        Random numberRandom = new Random();
        int numberOne = numberRandom.nextInt(20);
        int numberTwo = numberRandom.nextInt(10);

        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + numberOne + " * " + numberTwo);
        System.out.print("Your answer: ");
        int answerOne = scanner.nextInt();

        var resultOne = numberOne * numberTwo;

        if (answerOne == resultOne) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerOne + "'" + " is wrong answer ;(. Correct answer was " + "'" + resultOne + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        int numberThree = numberRandom.nextInt(50);
        int numberFour = numberRandom.nextInt(50);

        System.out.println("Question: " + numberThree + " + " + numberFour);
        System.out.print("Your answer: ");
        int answerTwo = scanner.nextInt();

        var resultTwo = numberThree + numberFour;

        if (answerTwo == resultTwo) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerTwo + "'" + " is wrong answer ;(. Correct answer was " + "'" + resultTwo + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        int numberFive = numberRandom.nextInt(50);
        int numberSix = numberRandom.nextInt(500);

        System.out.println("Question: " + numberFive + " - " + numberSix);
        System.out.print("Your answer: ");
        int answerThree = scanner.nextInt();

        var resultThree = numberFive - numberSix;

        if (answerThree == resultThree) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + answerThree + "'" + " is wrong answer ;(. Correct answer was " + "'" + resultThree + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        scanner.close();
    }
}
