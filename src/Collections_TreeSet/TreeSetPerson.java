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
import java.util.TreeSet;

public class TreeSetPerson {

    public static void main(String[] args) {

        TreeSet<Person_Advanced> myTreeSet = new TreeSet<>();
        Person_Advanced person_1 = new Person_Advanced("Axel", 2000, 200.0);
        Person_Advanced person_2 = new Person_Advanced("Hans", 2100, 230.0);
        Person_Advanced person_3 = new Person_Advanced("Kurt", 1900, 250.0);

        myTreeSet.add(person_1);
        myTreeSet.add(person_2);
        myTreeSet.add(person_3);

        for (Person_Advanced myAdvancedPerson : myTreeSet) {
            System.out.println(myAdvancedPerson.toString());
        }

    }

}
