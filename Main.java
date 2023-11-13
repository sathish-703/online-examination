public class Main {
    public static void main(String[] args) {
        // Creating questions
        Question question1 = new Question("What is the capital of France?",
                new String[] { "Berlin", "Madrid", "Paris", "Rome" }, 3);

        Question question2 = new Question("Which programming language is used for Android development?",
                new String[] { "Java", "C#", "Python", "Swift" }, 1);

        // Creating an exam
        Exam exam = new Exam();
        exam.addQuestion(question1);
        exam.addQuestion(question2);

        // Conducting the exam
        exam.conductExam();
    }
}
