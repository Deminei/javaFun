import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your test score (between 0 and 100): ");
        int score = input.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is an A :D");
        } else if (score >= 80 && score < 90) {
            System.out.println("Your grade is a B :)");
        } else if (score >= 70 && score < 80) {
            System.out.println("Your grade is a C :|");
        } else if (score >= 60 && score < 70) {
            System.out.println("Your grade is a D :l");
        } else {
            System.out.println("Your grade is an F :(");
        }
    }
}
