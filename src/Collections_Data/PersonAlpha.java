/**
 * This is a example application how to implement the different types
 * of collections.
 *
 * Enjoy the course and feel free to contribute.
 */
package Collections_Data;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class PersonAlpha extends Person implements Comparable {

    public PersonAlpha(String newName, int newDate, double newLoan) {
        super(newName, newDate, newLoan);
    }

    @Override
    public int compareTo(Object myObject) {
        PersonAlpha personAlpha_X = this;
        PersonAlpha personAlpha_Y = (PersonAlpha) myObject;
        return personAlpha_X.getName().compareTo(personAlpha_Y.getName());
    }

    @Override
    public boolean equals(Object inputObject) {
        PersonAlpha myPerson = (PersonAlpha) inputObject;

        if (!(myPerson instanceof PersonAlpha)) {
            return false;
        }

        if (myPerson.getName().equals(getName())
                && myPerson.getGehalt() == getGehalt()) {
            return true;
        } else {
            return false;
        }

    }

}
