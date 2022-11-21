package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void main(String[] str) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        Random integerNumber = new Random();
        int numberOne = integerNumber.nextInt(100);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + numberOne);
        System.out.print("Your answer: ");
        String answerOne = scanner.next();

        String yes = "yes";
        String no = "no";

        if (numberOne % 2 == 0 && answerOne.equals(yes)) {
            System.out.println("Correct!");
        } else if (numberOne % 2 != 0 && answerOne.equals(no)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerOne + "'" + " is wrong answer ;(. Correct answer was '" + answerOne + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        int numberTwo = integerNumber.nextInt(100);

        System.out.println("Question: " + numberTwo);
        System.out.print("Your answer: ");
        String answerTwo = scanner.next();

        if (numberTwo % 2 == 0 && answerTwo.equals(yes)) {
            System.out.println("Correct!");
        } else if (numberTwo % 2 != 0 && answerTwo.equals(no)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answerTwo + "'" + " is wrong answer ;(. Correct answer was '" + answerTwo + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        int numberThree = integerNumber.nextInt(100);

        System.out.println("Question: " + numberThree);
        System.out.print("Your answer: ");
        String answerThree = scanner.next();

        if (numberThree % 2 == 0 && answerThree.equals(yes)) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else if (numberThree % 2 != 0 && answerThree.equals(no)) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + answerThree + "'" + " is wrong answer ;(. Correct answer was '" + answerThree + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        scanner.close();
    }
}
