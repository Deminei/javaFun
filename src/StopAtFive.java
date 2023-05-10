import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
        } while (number != 5);

        System.out.println("You entered 5. Thank you, goodbye!");
    }
}

