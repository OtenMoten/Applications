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
import java.util.Collections;

public class Main_Alpha {

    public static void main(String[] args) {

        ArrayList<Person> myPersonList = new ArrayList<>();

        Person person_1 = new Person("Axel", 2000, 200.0);
        Person person_2 = new Person("Karl", 2001, 230.0);
        Person person_3 = new Person("Karla", 1900, 250.0);
        Person person_4 = new Person("Alf", 1998, 210.0);
        Person person_5 = new Person("Ulf", 2010, 233.0);
        Person person_6 = new Person("Max", 1945, 250.0);

        myPersonList.add(person_1);
        myPersonList.add(person_2);
        myPersonList.add(person_3);
        myPersonList.add(person_4);
        myPersonList.add(person_5);
        myPersonList.add(person_6);

        myPersonList.forEach((myPerson) -> {
            System.out.println(myPerson);
        });

        System.out.println();
        
        ArrayList<String> myStringList = new ArrayList<>();
        myStringList.add("Meier");
        myStringList.add("Maier");
        myStringList.add("Mayer");
        System.out.println("Unsorted: \n" + myStringList);
        Collections.sort(myStringList);
        System.out.println("Sorted: \n" + myStringList);
    }

}
