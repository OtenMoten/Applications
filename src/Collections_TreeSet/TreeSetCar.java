/**
 * This is a example application how to implement the different types
 * of collections.
 *
 * Enjoy the course and feel free to contribute.
 */
package Collections_TreeSet;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetCar {

    public static void main(String[] args) {

        ArrayList<Car> myCarArrayList = new ArrayList<>();
        myCarArrayList.add(new Car("AUDI", 2001, 20500));
        myCarArrayList.add(new Car("VW", 2000, 19500));
        myCarArrayList.add(new Car("Opel", 2010, 25500));
        myCarArrayList.add(new Car("Porsche", 1999, 60500));

        myCarArrayList.forEach((myCar) -> {
            System.out.println(myCar.toString());
        });
        System.out.println();

        System.out.println("Sort by brand ----------------------");
        TreeSet<Car> myCarTreeSetList_Alpha = new TreeSet<>(new CarComparatorBrand());
        myCarTreeSetList_Alpha.addAll(myCarArrayList);
        myCarTreeSetList_Alpha.forEach((myCar) -> {
            System.out.println(myCar);
        });
        System.out.println();

        System.out.println("Sort by price -----------------------");
        TreeSet<Car> myCarTreeSetList_Beta = new TreeSet<>(new CarComparatorPrice());
        myCarTreeSetList_Beta.addAll(myCarArrayList);
        myCarTreeSetList_Beta.forEach((myCar) -> {
            System.out.println(myCar);
        });

    }

}
