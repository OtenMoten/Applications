/**
 * This is a example application how to implement the different types
 * of collections.
 *
 * Enjoy the course and feel free to contribute.
 */
package Collections_HashMap;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Person person_Alpha = new Person("Alex", 1980, 2300.0);
        Person person_Beta = new Person("Carlos", 1983, 2500.0);
        Person person_Gamma = new Person("Bert", 1970, 7300.0);

        HashMap<Integer, Person> myHashMap = new HashMap<>();
        myHashMap.put(100, person_Alpha);
        myHashMap.put(200, person_Beta);
        myHashMap.put(300, person_Gamma);

        myHashMap.keySet().forEach((key) -> {
            System.out.println(key);
        });

        System.out.println("++++++++++++++++++++++++++++");

        myHashMap.values().forEach((value) -> {
            System.out.println(value);
        });

        System.out.println("----------------------------");

        myHashMap.values().forEach((value) -> {
            System.out.println(value.getName());
        });

        System.out.println("****************************");

    }

}
