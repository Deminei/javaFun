import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number less than 11: ");
        int number = input.nextInt();

        if (number >= 11) {
            System.out.println("Number must be less than 11.");
        } else {
            for (int i = number; i <= 11; i++) {
                System.out.println(i);
            }
        }
    }
}

