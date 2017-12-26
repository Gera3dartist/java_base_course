import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 21.12.17
 * Time: 9:50
 * To change this template use File | Settings | File Templates.
 */
public class NumberConverter {
    public static void main(String[] args) {
        // 1. take a number from stdin
        System.out.println("please enter an integer number: ");
        Scanner stdin = new Scanner(System.in);
        Integer number = stdin.nextInt();


        // 2. take a value to encod to: (bin|oct|hex)
        // 3. output value in (bin|oct|hex)
        System.out.println("Octal: " + Integer.toString(number, 8));
        System.out.println("Binary: " + Integer.toString(number, 2));
        System.out.println("Hexadecimal: " + Integer.toString(number, 16) + "p0");
    }
}
