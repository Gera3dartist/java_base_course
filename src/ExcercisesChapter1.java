import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 25.12.17
 * Time: 14:32
 * To change this template use File | Settings | File Templates.
 */
public class ExcercisesChapter1 {
    public static void main(String[] args) {
//        testNextUp();
//        doubleToInt();
//        System.out.println("result is: " + factorialTask6(10));
//        shortOperationsTask7();
//        printSubStringTask8();
//        compareStringTask9();
//        randomStringTask10();
//        printUnicodeTask11();
//        loteryMachineTask13();
//        checkMagicCubeTask14();
//        buildPascalTriangleTask15();
        improveAverageTask16(1.0, 3.4, 5.6);
//        improveAverageTask16();



        //
    }

    public static void testNextUp(){
        Scanner line = new Scanner(System.in);
        System.out.println("enter a double value: ");
        String entry = line.nextLine();
        double input = Double.parseDouble(entry);
        System.out.println("result of nextUp is: " + Math.nextUp(input));
    }

    public static void doubleToInt() {
        System.out.println("Here is Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Here is Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        int value  = (int) Double.MAX_VALUE;

        System.out.println("Here is casted double -> int: " + value);

    }

    public static BigInteger factorialTask6(Integer n) {
        BigInteger result = new BigInteger("1");
        for (Integer i = 1; i<n+1; i++)
            result = result.multiply(new BigInteger(i.toString()));
        return result;
    }

    public static void shortOperationsTask7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        Short operand1 = scanner.nextShort();
        System.out.println("Enter second value: ");
        Short operand2 = scanner.nextShort();
        System.out.println("Enter operand: ");
        String operation = scanner.next();
        if (operation.equals("+")) {
            System.out.println("op: add; result: " + (operand1 + operand2));
        }
        else if (operation.equals("-")) {
            System.out.println("op: subtract; result: " + (operand1 - operand2));
        }
        else if (operation.equals("*")) {
            System.out.println("op: multiply; result: " + (operand1 * operand2));
        }
        else if (operation.equals("/")) {
            System.out.println("op: divide; result: " + (operand1 / operand2));
        }
        else {
            System.out.println("unrecognized operation");
        }
    }

    public static void printSubStringTask8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("print any text:> ");
        String line = scanner.nextLine();
        for (String item : line.split("\\s+")){
            System.out.println(item);
        }

    }

    public static void compareStringTask9() {
        String foo = "foo bar";
        StringBuilder buffer = new StringBuilder();
        String [] parts = {"foo ", "bar"};
        for (String word: parts){
            buffer.append(word);
        }
        System.out.println("Comparing two words: " + (foo == buffer.toString()));
    }

    public static void randomStringTask10() {
       Long random = (long) (Math.random() * 1000000000);
        System.out.println("Coef: " + Long.toString(random, 36));
    }

    public static void printUnicodeTask11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter unicode text: ");
        String line = scanner.nextLine();
        for (Character item : line.toCharArray()) {
            if (item.charValue() >= 32 && item.charValue() < 127){
                continue;
            }
            System.out.println("Unicode item: " + (int)item + "; value: " + item);
        }
    }

    public static void loteryMachineTask13() {
        ArrayList<Integer> choices = new ArrayList<Integer>();
        int [] winningCombination  = new int[6];
        // initialize array
        for (int i=0; i<50; i++) {
            choices.add(i);
        }
        // random select from array
        for (int i=0; i<6; i++) {
            int index = (int)(Math.random() * 50);
            winningCombination[i] = choices.get(index);
            choices.remove(index);
        }
        Arrays.sort(winningCombination);
        System.out.println("Winning combination: ");
        for (int number: winningCombination) {
            System.out.print(number + ", ");
        }
    }

    public static void checkMagicCubeTask14() {
        int [][] cube  = new int [4][4];
        System.out.println("enter array of integers, empty string for end of input: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int row_counter = 0;
        while (!line.equals("")) {
            String [] input = line.split("\\s+");
            for (int i = 0; i < input.length; i++ ){
                cube[row_counter][i] = Integer.parseInt(input[i]);
            }
            row_counter++;
            line = scanner.nextLine();
        }
        for (int[] number: cube) {
            System.out.println("output row: ");
            for (int num: number) {
                System.out.print(num + ", ");
            }
        }
        // check if cube is magic

        //find a diagonal sum
        int rowSum = 0;
        int columnSum = 0;
        int [] rowSumResult = new int [4];
        int [] columnSumResult = new int [4];
        int [] diagonalSumResult = new int [2];
        for (int i=0; i<cube.length; i++) {
            for (int j=0; j<cube.length; j++) {
               rowSum += cube[i][j];
               columnSum += cube[j][i];
            }
            rowSumResult[i] = rowSum;
            columnSumResult[i] = columnSum;
            diagonalSumResult[0]+=cube[i][i];
            diagonalSumResult[1]+=cube[i][(cube.length-1) - i];

            rowSum = 0;
            columnSum = 0;
        }

        System.out.println("primary diagonal sum: " + diagonalSumResult[0]);
        System.out.println("secondary diagonal sum: " + diagonalSumResult[1]);
        System.out.println("Row sum: " + Arrays.toString(rowSumResult));
        System.out.println("Column sum: " + Arrays.toString(columnSumResult));
        int [] container = IntStream.concat(Arrays.stream(diagonalSumResult),
                IntStream.concat(Arrays.stream(rowSumResult), Arrays.stream(columnSumResult))).toArray();
        if (container[0]==(Arrays.stream(container).sum()/container.length)) {
            System.out.println("Is Magic cube");
        }
        else {
            System.out.println("is NOT Magic cube");
        }


    }

    public static void buildPascalTriangleTask15() {
        System.out.println("Enter size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<>();
        for (int i=0; i<size; i++){ //row counter
            ArrayList<Integer> row = new ArrayList<>();
            for (int j=0; j<(i+1); j++){
                if (j==0 || j==i){
                    row.add(j, 1);
                } else {
                    // calculate actual value
                    row.add(j, pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j));
                }
            }
            pascalTriangle.add(i, row);
        }
        for (ArrayList<Integer> item: pascalTriangle) {
            System.out.println("pascals triangle is: " + item.toString());
        }
    }

    public static void improveAverageTask16( double... values) {
        if (values.length == 0) {
            System.out.println("at least one arg should be provided");
        } else {
            double S = 0;
            for (double item: values){ S += item;}
            System.out.println(S/values.length);
        }



    }



}
