import java.text.CollationElementIterator;
import java.util.*;

public class Main  {
    public static void main(String[] args) {


        System.out.println("~~~~~~~~~~~~~~~~~sort array~~~~~~~~~~~~~~~~~~");
        Random random = new Random();
        int [] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,2);


        }
        Arrays.sort(array);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));


        LinkedList<Integer>integers = new LinkedList<>();

        System.out.println("~~~~~~~~~~~~~~~~ LinkedList sort~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < 5; i++) {
            int ran = random.nextInt(0,2);
            integers.add(ran);


        }
        Collections.sort(integers);
        System.out.println("integers = " + integers);


        ArrayList<Integer>integers1 = new ArrayList<>();
        System.out.println("~~~~~~~~~~~~~~~~~~~~ ArrayList ~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < 5; i++) {
            int ran = random.nextInt(0,2);
            integers1.add(ran);
        }
        Collections.sort(integers1);
        System.out.println("integers1 = " + integers1);


    }


}