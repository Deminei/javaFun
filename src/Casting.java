// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Casting {

    public static void main(String[] args) {
        double num = 112.35;
        int data = (int)num;
        System.out.println("Double: "+num);
        System.out.println("int: "+data);

        String data2 = "49";
        int num2 = Integer.parseInt(data2);
        System.out.println("The string value is: "+data2);
        System.out.println("The integer value is: "+num2);


    }
}