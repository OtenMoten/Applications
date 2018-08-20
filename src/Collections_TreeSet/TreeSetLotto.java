/**
 * This is a example application how to implement the different types
 * of collections.
 *
 * Enjoy the course and feel free to contribute.
 */
package Collections_TreeSet;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetLotto {

    public static void main(String[] args) {

        TreeSet<Integer> myLottoTreeSet = new TreeSet<>();

        while (myLottoTreeSet.size() < 6) {
            int z = new Random().nextInt(49) + 1;
            myLottoTreeSet.add(z);
        }

        System.out.println();
        Iterator<Integer> myIterator = myLottoTreeSet.iterator();
        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + " ");
        }

    }

}
