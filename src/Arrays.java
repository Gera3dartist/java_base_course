import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 14.12.17
 * Time: 1:04
 * To change this template use File | Settings | File Templates.
 */
public class Arrays {
    public static void main(String [] args) {
        System.out.println("Hello world");
        Arrays.arraysCheck();
        Arrays.arrayListCheck();
    }

    public static void arraysCheck() {
        String [] names;
        names = new String[100];
        System.out.println(names);
        for (int i=0; i<names.length; i++) {
            names[i] = "name_" + i;
            System.out.println(names[i]);
        }
        int[] primes = { 2, 3, 5, 7, 11, 13};
        System.out.println(primes);
    }
    public static void arrayListCheck() {
        ArrayList<String> friends;
        friends = new ArrayList<String>();
        for (int i=0; i<100; i++){
            friends.add("Friend_" + i);
        }
        for (int i=0; i<100; i++) {
            System.out.println(friends.get(i));
        }

    }

}
