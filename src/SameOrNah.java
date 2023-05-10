import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = input.next();

        System.out.print("Enter the second word: ");
        String word2 = input.next();

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}


