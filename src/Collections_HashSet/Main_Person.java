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

public class Main_Person {

    public static void main(String[] args) throws Exception {

        Person person_1 = new Person("Max", 1955, 2345);
        Person person_2 = new Person("Mex", 1957, 2377);
        Person person_3 = new Person("Peter", 2001, 2800);

        System.out.println(person_1.hashCode() + "# " + person_1);
        System.out.println(person_2.hashCode() + "# " + person_2);
        System.out.println(person_3.hashCode() + "# " + person_3);

        System.out.println("***************************");

        HashSet<Person> myHashSet = new HashSet<>();

        myHashSet.add(person_1);
        myHashSet.add(person_2);
        myHashSet.add(person_3);
        myHashSet.add(person_1);

        myHashSet.forEach((myPerson) -> {
            System.out.println(myPerson.toString() + "--" + myPerson.hashCode());
        });

    }

}
