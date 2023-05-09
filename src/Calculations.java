import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter another number:");
        int numTwo = Integer.parseInt(scanner.nextLine());

        // Assign a variable to print the sum of the two numbers
        int numbers = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + numbers);

        //Assigned variable to print the remainder of the two numbers
        int subtractedNums = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + subtractedNums);

        //Assigned variable to print the multiplied result of the two numbers
        int multipliedNums = numOne * numTwo;
        System.out.println(numOne + " * " + numTwo + " = " + multipliedNums);

        /* Assigned variable to print the divided result of the two float numbers */
        float floatOne = (float) numOne;
        float floatTwo = (float) numTwo;
        float dividedFloats = floatOne / floatTwo;
        System.out.println(numOne + " / " + numTwo + " = " + dividedFloats);

        // Assign a variable to print the modulus of the two numbers
        int remainderOfNums = numOne % numTwo;
        System.out.println(numOne + " % " + numTwo + " = " + remainderOfNums);

    }
}
