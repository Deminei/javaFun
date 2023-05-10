import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temperature;

        do {
            System.out.print("Enter a number greater than 212:");
            temperature = input.nextInt();
        } while (temperature < 212);

        System.out.println("Water is boiling!");
    }
}

