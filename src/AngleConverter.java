import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 21.12.17
 * Time: 10:46
 * To change this template use File | Settings | File Templates.
 */
public class AngleConverter {
    public static void main(String[] args) {
        int wholeAngle = 359;
        System.out.println("Please, enter degree: ");
        Scanner in = new Scanner(System.in);
        Integer normlizedAngle;
        int angle = in.nextInt();
        normlizedAngle = angle % wholeAngle;
        System.out.println("result: " + normlizedAngle.toString());
        //
    }

}
