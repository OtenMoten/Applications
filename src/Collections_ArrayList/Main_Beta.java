/**
 * This is a example application how to implement the different types
 * of collections.
 *
 * Enjoy the course and feel free to contribute.
 */
package Collections_ArrayList;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Main_Beta {

    public static void main(String[] args) {

        ArrayList<Person> myPersonList_Alpha = new ArrayList<>();

        Person person_1 = new Person("Alex", 1980, 2200.0);
        Person person_2 = new Person("Axel", 1984, 22500.0);
        myPersonList_Alpha.add(person_1);
        myPersonList_Alpha.add(person_2);
        myPersonList_Alpha.add(person_1);

        System.out.println("(1) -----------------------------------");
        myPersonList_Alpha.forEach((myPerson) -> {
            System.out.println(myPerson);
        });

        ArrayList<Person> myPersonList_Beta = new ArrayList<>();
        myPersonList_Beta.add(new Person("Marta", 1980, 2200.0));
        myPersonList_Beta.add(new Person("Martin", 1984, 22500.0));

        System.out.println("(2) -----------------------------------");
        Iterator<Person> myIterator = myPersonList_Beta.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next().toString());
        }

        System.out.println("(3) -----------------------------------");
        myPersonList_Beta.forEach((myPerson) -> {
            System.out.println(myPerson);
        });

        System.out.println("(4) -----------------------------------");
        for (int i = 0; i < myPersonList_Beta.size(); i++) {
            System.out.println(myPersonList_Beta.get(i));
        }

    }

}
