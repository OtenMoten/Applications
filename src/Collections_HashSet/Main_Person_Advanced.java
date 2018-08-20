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

public class Main_Person_Advanced {

    public static void main(String[] args) throws Exception {

        Person_Advanced personAdvanced_1 = new Person_Advanced("Max", 1955, 2345);
        Person_Advanced personAdvanced_2 = new Person_Advanced("Mex", 1957, 2377);
        Person_Advanced personAdvanced_3 = new Person_Advanced("Peter", 2001, 3000);

        System.out.println(personAdvanced_1.hashCode() + "# " + personAdvanced_1);
        System.out.println(personAdvanced_2.hashCode() + "# " + personAdvanced_2);
        System.out.println(personAdvanced_3.hashCode() + "# " + personAdvanced_3);

        System.out.println("***************************");

        HashSet<Person_Advanced> myHashSet = new HashSet<>();

        myHashSet.add(personAdvanced_1);
        myHashSet.add(personAdvanced_2);
        myHashSet.add(personAdvanced_3);
        myHashSet.add(personAdvanced_1);

        myHashSet.forEach((myAdvancedPerson) -> {
            System.out.println(myAdvancedPerson.toString() + "--" + myAdvancedPerson.hashCode());
        });

    }
}
