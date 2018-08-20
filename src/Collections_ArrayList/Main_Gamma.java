/**
 * This is a example application how to implement the different types
 * of collections.
 *
 * Enjoy the course and feel free to contribute.
 */
package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main_Gamma {

    public static void main(String[] args) {

        ArrayList<Person> myPersonList = new ArrayList<>();
        myPersonList.add(new Person("Marta", 1980, 2200.0));
        myPersonList.add(new Person("Martin", 1984, 22500.0));
        myPersonList.add(new Person("Karla", 1980, 2200.0));
        myPersonList.add(new Person("Karl", 1984, 22500.0));
        myPersonList.add(new Person("Dora", 1980, 2200.0));
        myPersonList.add(new Person("Axel", 1984, 22500.0));

        myPersonList.forEach((myPerson) -> {
            System.out.println(myPerson);
        });
        System.out.println("-----------------------------");

        //  Remove "Karla" with a Iterator-object.
        Iterator<Person> myIterator = myPersonList.iterator();
        while (myIterator.hasNext()) {
            if (myIterator.next().getName().equalsIgnoreCase("karl")) {
                myIterator.remove();
            }
        }

        //  Remove "Karla" with a For-Loop.
        for (int i = 0; i < myPersonList.size(); i++) {
            if (myPersonList.get(i).getName().equals("Karla")) {
                myPersonList.remove(i);
            }
        }

        myPersonList.forEach((myPerson) -> {
            System.out.println(myPerson);
        });

    }

}
