import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "";

        while (!answer.equals("yes")) {
            System.out.print("Do you want to take a break?");
            answer = input.next();
        }

        System.out.println("Great, take a break!");
    }
}

