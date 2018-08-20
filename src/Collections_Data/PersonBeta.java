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
public class PersonBeta {

    private final String myName;
    private final int myDate;
    private final double myLoan;

    public PersonBeta(String newName, int newDate, double newLoan) {
        this.myName = newName;
        this.myDate = newDate;
        this.myLoan = newLoan;
    }

    @Override
    public int hashCode() {

        final int primeNumber = 31;
        int result = 1;

        result = primeNumber * result + this.myDate;
        result = primeNumber * result + ((this.myName == null) ? 0 : this.myName.hashCode());

        return result;

    }

    @Override
    public boolean equals(Object inputObject) {

        if (this == inputObject) {
            return true;
        }

        if (inputObject == null) {
            return false;
        }

        if (getClass() != inputObject.getClass()) {
            return false;
        }

        PersonBeta myPersonBeta = (PersonBeta) inputObject;

        if (this.myDate != myPersonBeta.myDate) {
            return false;
        }

        if (this.myName == null) {
            if (myPersonBeta.myName != null) {
                return false;
            }
        } else if (!this.myName.equals(myPersonBeta.myName)) {
            return false;
        }

        return true;

    }

    public String getName() {
        return this.myName;
    }

    public Integer getJahr() {
        return this.myDate;
    }

    public Double getGehalt() {
        return this.myLoan;
    }

    @Override
    public String toString() {
        return this.myName + " : " + this.myDate + " - " + this.myLoan;
    }

}
