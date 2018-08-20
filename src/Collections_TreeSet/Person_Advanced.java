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
public class Person_Advanced extends Person implements Comparable {

    public Person_Advanced(String newName, int newDate, double newLoan) {
        super(newName, newDate, newLoan);
    }

    @Override
    public int compareTo(Object myObject) {
        Person_Advanced myAdvancedPerson = (Person_Advanced) myObject;
        return myAdvancedPerson.getName().compareTo(getName());
    }

}
