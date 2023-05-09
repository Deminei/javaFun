import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        //Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        //Scanner will read input entered by user
        String text = scanner.nextLine();
        //Prints "Hi" and user's text that was entered
        System.out.println("Hi "+text);
    }
}
