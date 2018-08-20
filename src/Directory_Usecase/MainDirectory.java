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
public class MainDirectory {

    public static void main(String[] args) {

        Directory myDirectory = new Directory();

        myDirectory.addRecord(new Record("Meise, Max", "1234500"));
        myDirectory.addRecord(new Record("Amsel, Armin", "1122334455"));
        myDirectory.addRecord(new Record("Storch, Susanne", "1124455"));

        myDirectory.addRecord(new Pub("Red Horse", "112233", 2));
        myDirectory.addRecord(new Pub("Wine pub", "812309", 0));

        myDirectory.addRecord(new ServiceStation("Car stop'n'shop", "567819", true));
        myDirectory.addRecord(new ServiceStation("Free service point Heinze", "781900", false));

        System.out.println();

        System.out.println(myDirectory);

    }

}
