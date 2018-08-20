/**
 * Here you can learn how to create a telephone directory application.
 *
 * Enjoy the course and feel free to contribute.
 */
package Directory_Usecase;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Record {

    protected String name, phoneNumber;

    public Record(String newSurname, String newPhoneNumber) {
        this.name = newSurname;
        this.phoneNumber = newPhoneNumber;
    }

    public Record(String forename, String newSurname, String newPhoneNumber) {
        this.name = newSurname + ", " + forename;
        this.phoneNumber = newPhoneNumber;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {

        String myString = ".";
        while (myString.length() < 40) {
            myString += ".";
        }

        StringBuilder myRecord = new StringBuilder(myString);

        myRecord.replace(0, this.name.length(), this.name);
        myRecord.replace(myString.length() - this.phoneNumber.length(),
                myString.length(), this.phoneNumber);

        return myRecord.toString();

    }
}
