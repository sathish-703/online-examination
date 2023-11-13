import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {
    private List<Question> questions;
    private int score;

    public Exam() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void conductExam() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Enter your answer (1-" + options.length + "): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == question.getCorrectOption()) {
                score++;
            }
        }

        System.out.println("Your score: " + score + "/" + questions.size());
        scanner.close();
    }
}
