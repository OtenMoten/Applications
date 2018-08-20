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

public class Main {

    public static void main(String[] args) {

        ArrayList<Record> myDirectory = new ArrayList<>();

        myDirectory.add(new Record("Meise, Max", "1234500"));
        myDirectory.add(new Record("Amsel, Armin", "1122334455"));
        myDirectory.add(new Record("Storch, Susanne", "1124455"));

        myDirectory.add(new Pub("Zum roten Ochsen", "112233", 2));
        myDirectory.add(new Pub("Weinstube Kurt", "812309", 0));

        myDirectory.add(new ServiceStation("Motordienst Seidl", "567819", true));
        myDirectory.add(new ServiceStation("Freie Werkstatt Heinze ", "781900", false));

        myDirectory.forEach((myRecord) -> {
            System.out.println(myRecord);
        });

    }

}
