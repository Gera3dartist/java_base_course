import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 21.12.17
 * Time: 11:08
 * To change this template use File | Settings | File Templates.
 */
public class MinMaxClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = in.nextInt();
        System.out.println("enter second number: ");
        int b = in.nextInt();
        System.out.println("enter third number: ");
        int c = in.nextInt();
//        int result = findMax(findMax(a, b), c);
        int result = findMaxMath(a, b, c);
        System.out.println("Max is: " + result);

    }

    public static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    public static int findMaxMath(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

}
