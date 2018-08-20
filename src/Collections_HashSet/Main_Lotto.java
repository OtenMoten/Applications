/**
 * This is a example application how to implement the different types
 * of collections.
 *
 * Enjoy the course and feel free to contribute.
 */
package Collections_HashSet;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Main_Lotto {

    public static void main(String[] args) {

        HashSet<Integer> myLottoHashSet = new HashSet<>();
        Random myRandomizer = new Random();

        while (myLottoHashSet.size() < 6) {
            int myRandomNumber = myRandomizer.nextInt(49) + 1;
            //Integer zz = new Integer(z);
            System.out.print(myRandomNumber + " ");
            myLottoHashSet.add(myRandomNumber);
        }

        System.out.println();
        System.out.println("-----------------");

        //  Create a new Iterator-object with values from
        //  the myLottoHashSet-object.
        Iterator<Integer> myIterator_Alpha = myLottoHashSet.iterator();
        //  Print the values via the myIterator-object.
        while (myIterator_Alpha.hasNext()) {
            System.out.println(myIterator_Alpha.next() + " ");
        }

        System.out.println("-----------------");

        //  Create a new TreeSet-object with values from
        //  the myLottoHashSet-object.
        TreeSet<Integer> myLottoTreeSet = new TreeSet<>(myLottoHashSet);
        Iterator<Integer> myIterator_Beta = myLottoTreeSet.iterator();
        //  Print the value via the myIterator_Beta-object.
        while (myIterator_Beta.hasNext()) {
            System.out.print(myIterator_Beta.next() + " ");
        }

        System.out.println();

    }

}
