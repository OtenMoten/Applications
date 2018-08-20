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
public class Person_Advanced extends Person {

    Person_Advanced(String newName, int newDate, double newLoan) {
        super(newName, newDate, newLoan);
    }

    @Override
    public boolean equals(Object myObject) {

        Person_Advanced myAdvancedPerson = (Person_Advanced) myObject;
        if (!(myAdvancedPerson instanceof Person_Advanced)) {
            return false;
        } else {

            if (myAdvancedPerson.getName().equals(getName())) {
                return true;
            } else {
                return false;
            }

        }

    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

}
