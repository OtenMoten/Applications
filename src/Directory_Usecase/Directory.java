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
import java.util.ArrayList;

public class Directory {

    private final ArrayList<Record> myDirectory = new ArrayList<>();

    public void addRecord(Record newRecord) {
        this.myDirectory.add(newRecord);
    }

    public ArrayList<Record> getTelBuch() {
        return this.myDirectory;
    }

    @Override
    public String toString() {

        String myString = "";

        for (Record myRecord : this.myDirectory) {
            myString += myRecord.toString() + "\n";
        }

        return myString;

    }
}
