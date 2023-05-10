import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number < 0) {
                System.out.println("Number must be positive.");
            } else if (number > 0) {
                System.out.println("Number is " + number);
            }
        } while (number != 0);

        System.out.println("You entered 0, goodbye.");
    }
}

