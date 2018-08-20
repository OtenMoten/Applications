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
import java.util.Comparator;

public class CarComparatorBrand implements Comparator<Object> {

    @Override
    public int compare(Object objectAlpha, Object objectBeta) {
        return ((Car) objectAlpha).getBrand().compareTo(((Car) objectBeta).getBrand());
    }

}
