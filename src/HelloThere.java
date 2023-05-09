import java.util.Scanner;
public class HelloThere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");

        String text = scanner.nextLine();

        System.out.println("Wow - Interesting. Tell me more!");

        Scanner scanner2 = new Scanner(System.in);
        String text2 = scanner2.nextLine();
        System.out.println("Well, It's been nice chatting with you! Goodbye!");
    }
}
