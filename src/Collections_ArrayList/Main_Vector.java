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
import java.util.Iterator;
import java.util.Vector;

public class Main_Vector {

    public static void main(String[] args) {

        Vector myVector = new Vector();
        myVector.addElement(new Person("Alex", 1980, 2200.0));
        myVector.addElement(new Person("Axel", 1984, 22500.0));

        myVector.forEach((myObject) -> {
            System.out.println(myObject.toString());
        });

        System.out.println("--------------------------");

        Vector<Person> myPersonVector = new Vector<>();
        myPersonVector.addElement(new Person("Marta", 1980, 2200.0));
        myPersonVector.addElement(new Person("Martin", 1984, 22500.0));

        Iterator<Person> myIterator = myPersonVector.iterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next().toString());
        }

    }

}
