package ProyectoInicial.src;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Voy a poner un triangulo asterisco
    }


/**
 * The Quiz class represents a quiz question with multiple choice options.
 * It contains the question text, an array of options, and the index of the correct answer.
 */
class Quiz {
    private String question;
    private String[] options;
    private int correctAnswer;

    public Quiz(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}

class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        score++;
    }
}

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        Player player = new Player(scanner.nextLine());
        Quiz[] quizzes = {
                new Quiz("What is the capital of France?",
                        new String[] { "1. London", "2. Paris", "3. Berlin", "4. Madrid" }, 2),
                new Quiz("Which planet is known as the Red Planet?",
                        new String[] { "1. Earth", "2. Mars", "3. Jupiter", "4. Saturn" }, 2),
                new Quiz("What is 2 + 2?",
                        new String[] { "1. 3", "2. 4", "3. 5", "4. 6" }, 2)
        };
        System.out.println("Welcome, " + player.getName() + ", to the Quiz Game!");

        for (Quiz quiz : quizzes) {
            System.out.println("\nQuestion: " + quiz.getQuestion());
            for (String option : quiz.getOptions()) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == quiz.getCorrectAnswer()) {
                System.out.println("Correct!");
                player.increaseScore();
            } else {
                System.out.println("Incorrect! The correct answer was: " + quiz.getCorrectAnswer());
            }
        }

        System.out.println("\nGame over, " + player.getName() + "! Your final score is: " + player.getScore());
        scanner.close();
    }
}}
